import java.util.HashMap;

public class L0509_FibonacciNumber {
    public int fib(int n){
        HashMap<Integer, Integer> cache = new HashMap();
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int result = 0;
        if(n < 2){
            return n;
        } else{
            result = fib(n -1) + fib(n -2);
        }
        cache.put(n, result);
        return result;
    }
}
