public class L1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        for(int i = n; i < nums.length; i ++) {
            nums[i] = nums[i] * 1024 + nums[i - n];
            // the maximum element in the array is 1000, choose any integer greater than 1000
        }
        int index = 0;
        for(int i = n; i < nums.length; i ++) {
            nums[index] = nums[i] % 1024;
            nums[index + 1] = nums[i] / 1024;
            index += 2;
        }
        return nums;
    }
}
