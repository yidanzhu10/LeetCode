import java.util.Stack;

public class L98_ValidateBinarySearchTree {
    // inorder traversal 1 of the tree
    // Iteration
    public static boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack();
        double leftChildVal = -Double.MAX_VALUE;
        while(root != null || !  stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.val <= leftChildVal) return false;
            leftChildVal = root.val;
            root = root.right;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
//        isValidBST(root);
        System.out.println(isValidBST(root));
    }
}
