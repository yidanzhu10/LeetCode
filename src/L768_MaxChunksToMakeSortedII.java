import java.util.Arrays;

public class L768_MaxChunksToMakeSortedII {
    public int maxChunksToSorted(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int ans = 0;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < arr.length; i ++) {
            sum1 += arr[i];
            sum2 += sorted[i];
            if(sum1 == sum2) {
                ans ++;
            }
        }
        return ans;
    }
}
