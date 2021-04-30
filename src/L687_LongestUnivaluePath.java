public class L687_LongestUnivaluePath {
    public int longestUnivaluePath(TreeNode root) {
        int[] path = new int[1];
        dfs(root, path);
        return path[0];
    }

    private int dfs(TreeNode node, int[] path) {
        if(node == null) return 0;
        int left = dfs(node.left, path);
        int right = dfs(node.right, path);

        int leftLength = 0;
        int rightLength = 0;
        if(node.left != null && node.left.val == node.val) {
            leftLength += left + 1;
        }
        if(node.right != null && node.right.val == node.val) {
            rightLength += right + 1;
        }
        path[0] = Math.max(path[0], leftLength + rightLength);
        return Math.max(leftLength, rightLength);
    }
}
