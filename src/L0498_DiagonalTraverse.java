public class L0498_DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] res = new int[row * col];
        int numOfScan = row + col - 1;
        int index = 0;

        for(int i = 0; i < numOfScan; i ++) {
            if(i % 2 == 0) {
                int x = i < row ? i : row - 1;
                int y = i < row ? 0 : i - (row - 1);
                while(x >= 0 && y < col) {
                    res[index ++] = mat[x --][y ++];
                }
            } else {
                int x = i < col ? 0 : i - (col - 1);
                int y = i < col ? i : col - 1;
                while(x < row && y >= 0){
                    res[index ++] = mat[x ++][y --];
                }
            }
        }
        return res;
    }
}
/**
 1. scan = m + n - 1;
 2. even index: upright
    int x = s < row ? s : row - 1;
    int y = s < rwo ? 0 : s - (row - 1);

    odd index: downleft
    int x = s < col ? 0 : s - (col - 1):
    int y = s < col ? s : col - 1;
 **/
