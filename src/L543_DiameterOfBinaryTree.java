public class L543_DiameterOfBinaryTree  {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        dfs(root, diameter);
        return diameter[0];
    }

    private int dfs(TreeNode node, int[] diameter) {
        if(node == null) return 0;
        int left = dfs(node.left, diameter);
        int right = dfs(node.right, diameter);

        diameter[0] = Math.max(diameter[0], left + right);
        return Math.max(left, right) + 1;
    }
}
