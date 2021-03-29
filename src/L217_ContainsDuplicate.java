import java.util.HashSet;
import java.util.Set;

public class L217_ContainsDuplicate {
    // time limit exceeded
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i ++) {
            for(int j = i + 1; j < n; j ++) {
                if(nums[i] == nums[j]) count ++;
            }
        }
        if(count >= 1) return true;
        else{
            return false;
        }
    }
    // Time complexity: O(1)
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
