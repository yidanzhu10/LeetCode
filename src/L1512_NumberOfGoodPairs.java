import java.util.ArrayList;
import java.util.List;

public class L1512_NumberOfGoodPairs {
     public int numIdenticalPairs(int[] nums) {
        int pair = 0;
        for(int i = 0; i < nums.length - 1; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if(nums[i] == nums[j]) {
                    pair ++;
                }
            }
        }
        return pair;
    }

    // Combinatortics
    public int numIdenticalPairs2(int[] nums) {
         int good_pair = 0;
         int[] freq = new int[101];
         for(int i = 0; i < nums.length; i ++) {
             freq[nums[i]] ++;
         }
         for (int i = 0; i < 101; i ++) {
             if (freq[i] > 1) {
                 good_pair += ((freq[i] - 1) * freq[i]) / 2;
             }
         }
         return good_pair;
    }
}
