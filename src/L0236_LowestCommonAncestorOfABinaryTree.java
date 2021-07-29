public class L0236_LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        } // found p or q or touch the ground
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) {
            return root;
        } // from root's left and right we found both p and q so root is the LCA
        if(left != null) return left;
        return right;
        // left is not null means from left's left and right we found both q ad p
        // so left is the LCA, otherwise, right is the answer
    }
}
