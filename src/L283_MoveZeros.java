public class L283_MoveZeros {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int write = 0;
        for(int read = 1; read < len; read ++) {
            if(nums[write] == 0 && nums[read] != 0) {
                nums[write] = nums[read];
                nums[read] = 0;
                write ++;
            }
            if(nums[write] != 0) write ++;
        }
    }
}
