import java.util.ArrayList;
import java.util.List;

public class L60_PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList();
        for(int i = 1; i <= n; i ++) {
            list.add(i);
        }
        int[] fact = new int[n];
        fact[0] = 1;
        for(int i = 1; i < n; i ++) {
            fact[i] = fact[i - 1] * i;
        }
        k = k - 1;
        StringBuilder sb = new StringBuilder();
        for(int i = n; i >= 0; i --){
            int num = list.remove((k / fact[i]));
            sb.append(num);
            k %= fact[i];
        }
        return sb.toString();
    }
}
