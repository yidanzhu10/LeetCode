package template;

public class TransposeMatrix {
    public void transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        // transpose the matrix m[i][j] -> m[j][i]
        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
