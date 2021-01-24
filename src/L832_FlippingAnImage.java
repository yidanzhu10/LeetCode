public class L832_FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] out = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i ++) {
            for(int j = 0; j < A[0].length; j ++) {
                out[i][j] = A[i][A[0].length - 1 - j];
                if(out[i][j] == 0) {
                    out [i][j] = 1;
                }
                else {
                    out[i][j] = 0;
                }
            }
        }
        return out;
    }
}
