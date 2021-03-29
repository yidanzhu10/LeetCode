import java.util.HashMap;

public class L136_SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int n = nums.length;
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : nums) {
            if(map.get(i) == 1) return i;
        }
        return 0;
    }
    // XOR Operation
    public int singleNumber2(int[] nums) {
        int n = 0;
        for(int i : nums) {
            n = n ^ i;
        }
        return n;
    }
}
