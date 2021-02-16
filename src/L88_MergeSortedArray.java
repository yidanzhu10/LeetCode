public class L88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        for(int i = m; i < len; i ++) {
            nums1[i] = nums2[i - m];
        }
        for(int i = 0; i < len; i ++) {
            for(int j = i + 1; j < len; j ++) {
                int tmp = 0;
                if(nums1[i] > nums1[j]) {
                    tmp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = tmp;
                }
            }
        }
    }
}
