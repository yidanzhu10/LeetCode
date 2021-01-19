import java.util.ArrayList;
import java.util.List;

public class L1313_DecompressRLEList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> decompressList = new ArrayList();
        int pair = nums.length / 2;
        for(int i = 0; i < pair; i ++) {
            int freq = nums[2 * i];
            for (int j = 0; j < freq; j ++) {
                decompressList.add(nums[2 * i + 1]);
            }
        }
        int[] out = new int[decompressList.size()];
        for(int i = 0; i < decompressList.size(); i ++) {
            out[i] = decompressList.get(i);
        }
        return out;

}
