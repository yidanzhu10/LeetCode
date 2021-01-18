import java.util.ArrayList;
import java.util.List;

public class L1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] list1 = new int[n];
        int[] list2 = new int[n];
        for (int i = 0; i < n; i ++) {
            list1[i] = nums[i];
        }
        for(int j = 0; j <n; j ++) {
            list2[j] = nums[j + n];
        }
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < n; k ++) {
            list.add(list1[k]);
            list.add(list2[k]);
        }
        int[] out = new int[nums.length];
        for (int h = 0; h < list.size(); h ++) {
            out[h] = list.get(h);
        }
        return out;
    }
    public int[] shuffle2(int[] nums, int n) {
        int[] ans = new int[ 2 * n];
        for (int i = 0; i < n; i ++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
