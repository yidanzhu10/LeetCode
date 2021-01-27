public class L1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i ++) {
            int count = 0;
            for(int j = 0; j < ans.length; j ++) {
                if(nums[i] > nums[j]) {
                    count ++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
