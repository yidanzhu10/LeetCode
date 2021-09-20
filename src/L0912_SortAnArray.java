import java.util.Arrays;

public class L0912_SortAnArray {
    public int[] sortArray(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        int mid = nums.length / 2;
        int[] leftList = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] rightList = sortArray(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(leftList, rightList);
    }
    private int[] merge(int[] leftList, int[] rightList){
        int[] mergedList = new int[leftList.length + rightList.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int mergedPointer = 0;

        while(leftPointer < leftList.length && rightPointer < rightList.length){
            if(leftList[leftPointer] < rightList[rightPointer]){
                mergedList[mergedPointer ++] = leftList[leftPointer ++];
            } else {
                mergedList[mergedPointer ++] = rightList[rightPointer ++];
            }
        }
        while(leftPointer < leftList.length){
            mergedList[mergedPointer ++] = leftList[leftPointer ++];
        }
        while(rightPointer < rightList.length){
            mergedList[mergedPointer ++] = rightList[rightPointer ++];
        }
        return mergedList;
    }
}
