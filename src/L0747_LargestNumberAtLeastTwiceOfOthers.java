public class L0747_LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int len = nums.length;
        int maxIndex = 0;
        int max = nums[0];
        for(int i = 0; i < len; i ++){
            if(max < nums[i]){
                max = nums[i];
                maxIndex = i;
            }
        }
        for(int i = 0; i < len; i ++) {
            if(nums[i] != max && max < 2 * nums[i]){
                return -1;
            }
        }
        return maxIndex;
    }
}
