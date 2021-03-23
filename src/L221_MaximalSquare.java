public class L221_MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;
        if(matrix == null || m == 0) return res;

        int[][]dp = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i ++) {
            for(int j = 1; j <= n; j ++) {
                if(matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j - 1]), dp[i - 1][j]) + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res * res;
    }
}
