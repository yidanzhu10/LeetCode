public class L0209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int res = Integer.MAX_VALUE;// size of the sliding window
        for(int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            while(left <= i && sum >= target) { // find the sliding window
                // minimize the window
                res = Math.min(res, i - left + 1);
                sum -= nums[left];
                left ++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
