public class L0779_KthSymbolInGrammar {
    public int kthGrammar(int n, int k) {
        if(n == 1 && k == 1) return 0;
        int midSize = (int) Math.pow(2, n - 2);
        if(k <= midSize) {
            return kthGrammar(n - 1, k);
        } else {
            return kthGrammar(n - 1, k - midSize) == 0 ? 1 : 0;
        }
    }
}
