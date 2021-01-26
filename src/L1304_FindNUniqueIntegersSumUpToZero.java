public class L1304_FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] out = new int[n];
        if(n % 2 == 0) {
            for(int i = 0; i < n/2; i ++) {
                out[i] = 1 + i;
                out[n - 1 - i] = -1 - i;
            }
        }
        else {
            out[n - 1] = 0;
            for(int i =0; i < (n - 1)/2; i ++) {
                out[i] = 1 + i;
                out[n - 2 - i] = -1 - i;
            }
        }
        return out;
    }
}
