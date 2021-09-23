public class L0240_SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while(col >= 0 && row < matrix.length){
            int num = matrix[row][col];
            if(num == target) return true;
            if(target < num){
                col --;
            } else {
                row ++;
            }
        }
        return false;
    }
}
