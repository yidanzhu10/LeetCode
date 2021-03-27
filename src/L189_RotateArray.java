public class L189_RotateArray {
    // brute force
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int temp, previous;
        // Time complexity: O(n * k), Space: O(1)
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
    /*
        i = 0 -> i = 3
        i = 1 -> i = 4
        ....
        i = 6 -> i = (i + k) % len = (6 + 3) % 7 = 2
         */
    // Time: O(n), space: O(n)
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] copy = new int[n];
        for(int i = 0; i < n; i ++) {
            copy[(i + k) % n] = nums[i];
        }
        for(int i = 0; i < n; i ++) {
            nums[i] = copy[i];
        }
    }
    /*
    break down the array into two parts
    0 to k - 1, k to len - 1
    reverse 1: (7, 6, 5), 4, 3, 2, 1
    reverse 2: (5, 6, 7), 4, 3, 2, 1
    reverse  3: 5, 6, 7, (1, 2, 3, 4)
     */
    // Time: O(n), space: O(1)
    public void rotate3(int[] nums, int k) {
        int n = nums.length;
        int temp;
        k = k % n; // in case that k is greater than the length of the array
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k , n - 1);
    }

    private void reverse(int[] nums, int startIndex, int endIndex) {
        while(startIndex < endIndex){
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex ++;
            endIndex --;
        }
    }
}
