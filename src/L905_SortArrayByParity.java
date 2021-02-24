public class L905_SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int k = 0;
        for(int i = 0; i < A.length; i ++) {
            if(A[i] % 2 == 0) {
                ans[k ++] = A[i];
            }
        }
        for(int i = 0; i < A.length; i ++) {
            if(A[i] % 2 != 0) {
                ans[k ++] = A[i];
            }
        }
        return ans;
    }
    public int[] sortArrayByParity2(int[] A) {
        int len = A.length;
        if(len == 1) return A;
        int w = 0;
        for(int r = 1; r < len; r ++) {
            if(A[w] % 2 != 0) {
                if(A[r] % 2 == 0) {
                    int temp = 0;
                    temp = A[w];
                    A[w] = A[r];
                    A[r] = temp;
                    w ++;
                }
                continue;
            }
            if(A[w] % 2 == 0) w ++;
        }
        return A;
    }
}
