package udemy;

public class L509_FibonnaciSequence {
    public static int fib(int n) {
//        // Recursion
//        if(n <= 1) return n;
//        return fib(n - 1) + fib(n - 2);

//        // Recursion_2
//        if(n < 2) {
//            return n;
//        }
//        int []fibNums = new int[n + 1];
//        fibNums[1] = 1;
//        for(int i =2; i <= n; i ++){
//            fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
//        }
//        return fibNums[n];

        // Iteration
        if(n < 2) {
            return n;
        }
        int a = 0;
        int b = 1;
        while(n -- > 1) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

}
