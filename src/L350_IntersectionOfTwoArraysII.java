import java.util.*;

public class L350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList();
        for(int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if(count > 0) {
                list.add(num);
                map.put(num, count - 1);
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for(int num : list) {
            result[i ++] = num;
        }
        return result;
    }
    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> list = (List<Integer>) new HashSet();
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i ++;
                j ++;
            } else if(nums1[i] < nums2[j]) {
                i ++;
            } else {
                j ++;
            }
        }
        int[] result = new int[list.size()];
        int k = 0;
        for(int num : list) {
            result[k ++] = num;
        }
        return result;
    }
}
