public class L1051_HeightChecker {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] copy = new int[len];
        for(int i = 0; i < len; i ++) {
            copy[i] = heights[i];
        }
        for(int i = 0; i < len; i ++) {
            for(int j = i + 1; j < len; j ++) {
                if(copy[i] > copy[j]) {
                    int temp = 0;
                    temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        int count = 0;
        for(int k = 0; k < len; k ++) {
            if(copy[k] != heights[k]) count ++;
        }
        return count;
    }
}
