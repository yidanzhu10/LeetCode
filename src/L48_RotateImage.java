public class L48_RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // transpose the matrix m[i][j] -> m[j][i]
        for(int i = 0; i < n; i ++) {
            for (int j = i; j < matrix[0].length; j ++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // flip the matrix horizontally swap(m[i][j], m[i][n-1-j])
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n / 2; j ++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
