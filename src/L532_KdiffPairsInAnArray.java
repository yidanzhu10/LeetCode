import java.util.HashMap;

public class L532_KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int res = 0;
        //put all the elements in hashmap
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for(int a : map.keySet()){ // original array
            if(k != 0){
                int b = a + k;
                if(map.containsKey(b)){ // avoid the duplicate
                    res ++;
                }
            }else{
                if(map.get(a) >= 2) //if k ==0. there should be a duplicate
                    res ++;
            }
        }
        return res;
    }
}
