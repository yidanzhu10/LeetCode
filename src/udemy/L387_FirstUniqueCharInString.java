package udemy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class L387_FirstUniqueCharInString {
	
	// Leetcode 387

	public static void main(String[] args) {
		String s = "Leetcode";
		Solution387.firstUniqChar(s);

	}
	 
	public static int firstUniqChar1(String s) {
		
		int index = 0;
		char[] arr = s.toCharArray();
		int freq = 1;
		Map<Character, Integer> map = new HashMap<> ();
		
		for (int i = 1; i < arr.length; i ++) {
			if(arr[i] != arr[i - 1]) {
				map.put(arr[i], freq);
			} else {
				freq += 1;
				map.put(arr[i], freq);
			}
		}
		
		char c = (char) 0;
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(Objects.equals(1, entry.getValue())) {
				c = entry.getKey();
			}
			
		}
		index = s.indexOf(c);
		
		System.out.println(index);
		return index;
	}

}

class Solution387 {
	public static int firstUniqChar(String s) {
		
		Map<Character, Integer> map = new HashMap<> ();
		int n = s.length();
		
		for (int i = 0; i < s.length(); i ++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for ( int i = 0; i < n; i ++) {
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		return -1;
	}
	
}
