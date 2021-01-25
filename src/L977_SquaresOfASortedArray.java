public class L977_SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] out = new int[nums.length];
        int hi = nums.length - 1;
        int lo = 0;
        for(int j = hi; j >= 0; j --) {
            if(Math.abs(nums[lo]) > Math.abs(nums[hi])) {
                out[j] = (int) Math.pow(nums[lo], 2);
                lo ++;
            }
            else {
                out[j] = (int) Math.pow(nums[hi], 2);
                hi --;
            }
        }
        return out;
    }
}
