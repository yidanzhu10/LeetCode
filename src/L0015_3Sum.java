import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L0015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i ++) {
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            //avoid the current i is the same as the previous one to get the unique triplet
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) {
                        left ++;
                        //avoid the current left pointer is the same as the next one
                    }
                    left ++;
                    while(left < right && nums[right - 1] == nums[right]) {
                        right --;
                        //avoid the current right pointer is the same as the next one
                    }
                    right --;
                } else if(sum > 0) {
                    right --;
                } else if(sum < 0) {
                    left ++;
                }
            }
        }
        return res;
    }
}
