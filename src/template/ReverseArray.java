package template;

public class ReverseArray {
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
