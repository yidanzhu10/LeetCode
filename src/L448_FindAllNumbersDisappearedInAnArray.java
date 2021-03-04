import java.util.ArrayList;
import java.util.List;

public class L448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len; i ++) {
            nums[(nums[i] - 1) % len] += len;
        }
        for(int i = 0; i < len; i ++) {
            if(nums[i] < len) list.add(i + 1);
        }
        return list;
    }
}
