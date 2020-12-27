package udemy;

public class LargestSumArray {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, -1, 3, 4, 10, 10, -10, -1};
		largestSumArray(arr);
	}
	
	private static int largestSumArray(int [] arr) {
		int sum = arr[0];
		int result = arr[0];
		
		for(int i = 0; i < arr.length; i ++) {
			
			sum = Math.max(sum + arr[i], arr[i]);
			result = Math.max(result, sum);
			
		}
		
		return result;
	}
	
}



