public class L1252_CellsWithOddValuesInAMatrix {
    public int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int[] row = new int[n];
        int [] col = new int[m];
        for(int[] nums : indices) {
            row[nums[0]] ++;
            col[nums[1]] ++;
        }
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j ++) {
                if ((row[i] + col[j]) % 2 == 1) {
                    count ++;
                }
            }
        }
        return count;
    }
}
