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
}
