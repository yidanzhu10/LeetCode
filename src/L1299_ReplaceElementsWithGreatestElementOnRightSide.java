public class L1299_ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;
        for(int i = 0; i < arr.length; i ++) {
            int max = 0;
            for(int j = i + 1; j < arr.length - 1; j ++) {
                max = Math.max(max, arr[j]);
            }
            ans[i] = max;
        }
        return ans;
    }
    public int[] replaceElements2(int[] arr) {
        int maxSoFar = arr[arr.length - 1]; //take last element in array as maxVal
        arr[arr.length - 1] = -1;
        //start array traversal from right to left
        for(int i = arr.length - 2; i > -1; i--){
            int currVal = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, currVal);
            //keep updating maxRight element encountered so far
        }
        return arr;
    }
    public int[] replaceElements3(int[] arr) {
        if(arr.length == 1) arr[0] = -1;
        int len = arr.length;
        for(int i = 0; i < len - 1; i ++) {
            int max = 0;
            for(int j = i + 1; j < len; j ++) {
                max = Math.max(max, arr[j]);
            }
            arr[i] = max;
        }
        arr[len - 1] = -1;
        return arr;
    }
}
