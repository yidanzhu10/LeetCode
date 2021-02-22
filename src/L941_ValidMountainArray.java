import java.io.OptionalDataException;

public class L941_ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        int i = 0;

        while(i + 1 < len && arr[i] < arr[i + 1]) i ++;

        if(i == 0 || i == len - 1) return false;

        while(i + 1 < len && arr[i] > arr[i + 1])
            i ++;

        return i == len - 1;
    }
    public boolean validMountainArray2(int[] A) {
        int n = A.length, i = 0, j = n - 1;
        while (i + 1 < n && A[i] < A[i + 1]) i++;
        while (j > 0 && A[j - 1] > A[j]) j--;
        return i > 0 && i == j && j < n - 1;
    }
}
