public class L1572_MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i < n; i ++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if((n - 1) % 2 == 0) {
            int mid = (mat.length - 1) / 2;
            sum = sum - mat[mid][mid];
        }
        return sum;
    }
}
