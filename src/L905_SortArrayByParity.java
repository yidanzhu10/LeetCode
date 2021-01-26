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
}
