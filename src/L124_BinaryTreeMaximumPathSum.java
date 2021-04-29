public class L124_BinaryTreeMaximumPathSum {
    int max_path_sum;
    public int maxPathSum(TreeNode root) {
        max_path_sum = Integer.MIN_VALUE;
        pathSum(root);
        return max_path_sum;
    }

    private int pathSum(TreeNode node) {
        if(node == null) return 0;
        int left = Math.max(pathSum(node.left), 0);
        int right = Math.max(pathSum(node.right), 0);
        max_path_sum = Math.max((left + right + node.val), max_path_sum);
        return Math.max(left, right) + node.val;
    }
}
