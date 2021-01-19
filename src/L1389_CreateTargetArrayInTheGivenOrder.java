import java.util.ArrayList;
import java.util.List;

public class L1389_CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length; i ++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[index.length];
        for(int i = 0; i < index.length; i ++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
