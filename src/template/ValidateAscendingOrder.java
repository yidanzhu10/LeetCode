package template;

public class ValidateAscendingOrder {
    // Time: lucky Omega(1), unlucky O(n). Space: Theta(1)
    public static boolean isAscendingOrder(int[] a) {
        int temp = -Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i ++) {
            if(a[i] < temp) return false;
            temp = a[i];
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 7, 9, 13, 50, 6};
        isAscendingOrder(array);
    }
}
