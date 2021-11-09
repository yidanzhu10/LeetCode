public class L0011_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int len = Math.min(height[left], height[right]);
            max = Math.max(max, (right - left) * len);
            if(height[left] > height[right]){
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
