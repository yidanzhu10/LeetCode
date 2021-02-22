public class L1346_CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len - 1; i ++) {
            for(int j = 1; j < len; j ++) {
                if(arr[i] == 2 * arr[j] || 2 * arr[i] == arr[j]) return true;
            }
        }
        return false;
    }
}
