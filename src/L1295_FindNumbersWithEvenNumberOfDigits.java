public class L1295_FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            if(String.valueOf(n).length() % 2 == 0){
                count ++;
            }
        }
        return count;
    }
    public int findNumbers2(int[] nums) {
        int count = 0;
        for(int n : nums) {
            int digit = 0;
            while(n != 0) {
                n = n / 10;
                digit ++;
            }
            if(digit % 2 == 0) count ++;
        }
        return count;
    }
}
