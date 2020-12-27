package udemy;

import java.util.HashSet;
import java.util.Set;

public class L268_MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MissingNumberSolution {
	public int missingNumber(int[] nums) {
		
		Set<Integer> set = new HashSet<Integer> ();
		for (int num : nums) {
			set.add(num);
		}
		
		int expectCount = nums.length + 1;
		for (int i = 0; i < expectCount; i ++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return -1;
    }
	
}
