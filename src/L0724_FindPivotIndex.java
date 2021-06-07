public class L0724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int leftSum = 0;
        for(int i = 0; i < length; i ++) {
            sum += nums[i];
        }
        for(int i = 0; i < length; i ++){
            if(leftSum * 2 + nums[i] == sum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

