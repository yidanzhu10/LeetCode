public class L0053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int res = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i ++){
            if(dp[i - 1] > 0){
                dp[i] = nums[i] + dp[i - 1];
            } else{
                dp[i] = nums[i];
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
