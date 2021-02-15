public class L1089_DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            int k = 0;
            if(arr[i] != 0) {
                continue;
            }
            else {
                k = i;
                for(int j = len - 1; j > k; j --) {
                    arr[j] = arr[j - 1];
                }
            }
            i ++;
        }
    }
    public void duplicateZeros2(int[] arr) {
        int len = arr.length;
        int count = 0;
        for(int i = 0; i < len ; i++) {
            if(arr[i] == 0) count ++;
        }
        for(int i = len - 1, j = len + count - 1; i < j; i --, j --) {
            if(arr[i] != 0){
                if(j < len) arr[j] = arr[i];
            }
            else{
                if(j < len) arr[j] = arr[i];
                j --;
                if(j < len) arr[j] = arr[i];
            }
        }

    }
}
