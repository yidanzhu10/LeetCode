package udemy;

import java.util.HashMap;
import java.util.Map;

public class L1_TwoSum {

	public static void main(String[] args) {
		int [] nums = {2, 7, 11, 15};
		int target = 9;
		
		twoSum(nums, target);

	}

	private static int[] twoSum(int[] nums, int target) {
		int [] pair = new int[2];
    	
    	for(int i = 0; i < nums.length; i ++) {
    		for(int j = 0; j < nums.length; j ++) {
    			if (nums[i] + nums[j] != target) {
    				continue;
    			}
    			else {
    				pair[0] = i;
    				pair[j] = j;
    			}
    		}
    	}
		
    	return pair;
	}
}

class TwoSumSolution {
	public int[] twoSum(int [] nums, int target) {
		Map<Integer, Integer> map = new HashMap<> ();
		
		for (int i = 0; i < nums.length; i ++) {
			int num = target - nums[i];
			if (map.containsKey(num)) {
				return new int [] {map.get(num), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution.");
		
	}
}
