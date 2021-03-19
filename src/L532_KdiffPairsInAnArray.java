import java.util.HashMap;

public class L532_KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int res = 0;
        //storing count of all the elements
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for(int a : map.keySet()){
            if(k != 0){
                /*we avoid duplicate by looking for the values (i,j)
                 where i is smaller element eg k=4 (1,3) & (3,1) gives same result
                 but when we are processing 1 we are looking for val greater than 1 to form the pair
                 and likewise when we are at 3 we are looking for val 3 and above to form the pair
                 */
                int b = a + k;
                if(map.containsKey(b)){
                    res ++;
                }
            }else{
                //processing the key so processing unique values which is occurring twice  and diff of it gives 0
                if(map.get(a) >= 2)
                    res ++;
            }
        }
        return res;
    }
}
