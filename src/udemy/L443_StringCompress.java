package udemy;

public class L443_StringCompress {
	
	// Leetcode 443

	public static void main(String[] args) {
		char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
		compress(chars);
	
	}
	
	public static int compress(char[] chars) {
		
		String output = "";
		int sum = 1;
		for(int i = 1; i < chars.length; i ++) {
			if(chars[i] == chars[i - 1]) {
				sum ++;
			}
			else {
				output = output + chars[i - 1] + sum;
				sum = 1; 
				
			}
		}
		output = output + chars[chars.length - 1] + sum;
		
		char[] result = output.toCharArray();
		int size = result.length;
		
		System.out.println(result);
		return size;
        
    }

}
