import java.util.ArrayList;
import java.util.List;

public class L0054_SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> res = new ArrayList();
        if(col == 0 || row == 0) return res;

        int rowBegin = 0; int rowEnd = row - 1;
        int colBegin = 0; int colEnd = col - 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            for(int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin ++;
            for(int i = rowBegin; i <=rowEnd; i ++){
                res.add(matrix[i][colEnd]);
            }
            colEnd --;

            if(rowBegin <= rowEnd) {
                for(int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd --;
            if(colBegin <= colEnd) {
                for(int i = rowEnd; i >= rowBegin; i --) {
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin ++;
        }
        return res;
    }
}
