import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 public class L104_MaximumDepthOfBinaryTree {
    // recursion
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static int maxDepth2(TreeNode root) {
        if(root == null) return 0;
        Stack<Integer> depth = new Stack();
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        depth.add(1);
        int height = 0;
        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            int currentHeight = depth.pop();
            if(current != null){
                height = Math.max(height, currentHeight);
                stack.push(current.right);
                depth.push(currentHeight + 1);
                stack.push(current.left);
                depth.push(currentHeight + 1);
            }
        }
        return height;
    }
     public static void main(String[] args) {
         TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
         maxDepth2(root);
     }
}
