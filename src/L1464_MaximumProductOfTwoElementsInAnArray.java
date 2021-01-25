import java.util.Arrays;

public class L1464_MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = (nums[len - 1] - 1) * (nums[len - 2] - 1);
        return res;
    }
}
