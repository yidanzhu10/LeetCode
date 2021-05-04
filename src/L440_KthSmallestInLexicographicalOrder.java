public class L440_KthSmallestInLexicographicalOrder {
    public int findKthNumber(int n, int k) {
        long cur = 1;
        k -= 1;
        while(k > 0) {
            int nodes = getNodes(n, cur);
            if(k >= nodes) {
                k -= nodes;
                cur ++; // go right
            } else {
                k -= 1;
                cur *= 10; // go down
            }
        }
        return (int)cur;
    }

    private int getNodes(int n, long cur){
        long next = cur + 1;
        long totalNodes = 0;

        while(cur <= n){
            totalNodes += Math.min((n - cur + 1), next - cur);

            next *= 10;
            cur *= 10;
        }
        return (int)totalNodes;
    }
}
