package udemy;

import java.util.Arrays;

public class L242_AnagramCheck {

	public static void main(String[] args) {
		Solution.isAnagram("arm", "mar");
		Solution2.isAnagram("god", "dog");
	}


}

class Solution {
	public static boolean isAnagram(String s, String t) {
		
		if (s.length() != t.length()) {
			return false;
		}
		
		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();
		
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		return Arrays.equals(arr1, arr2);
		
	}
}

class Solution2 {
	public static boolean isAnagram(String s, String t) {
		
		s.replace(" ", "");
		t.replace(" ", "");
		
		int [] counter = new int[26];
		
		for(int i = 0; i < s.length(); i ++) {
			counter[s.charAt(i) - 'a'] ++;
			counter[t.charAt(i) - 'a'] --;
		}
		
		for (int count : counter) {
			if (count != 0) {
				return false;
			}
		}
		
		return true;
	}
}
