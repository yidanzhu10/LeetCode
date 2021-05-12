public class L769_MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n; i ++) {
            max = Math.max(max, arr[i]);
            if(max == i) ans += 1;
        }
        return ans;
    }
}
