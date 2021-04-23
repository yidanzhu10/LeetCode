import java.util.Stack;

public class L98_ValidateBinarySearchTree {
    // inorder traversal 1 of the tree
    // Iteration
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack();
        while(root != null || stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
    //Recursion
    public static boolean isValidBST2(TreeNode root) {
        long preVal = Long.MIN_VALUE;
        if (root == null) return true;

        boolean left = isValidBST2(root.left);

        if (root.val <= preVal) return false;
        preVal = root.val;

        boolean right = isValidBST2(root.right);
        return left && right;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
//        isValidBST2(root);
        System.out.println(isValidBST2(root));
    }
}
