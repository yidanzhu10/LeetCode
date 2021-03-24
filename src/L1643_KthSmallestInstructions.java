public class L1643_KthSmallestInstructions {
    public String kthSmallestPath(int[] destination, int k) {

        int numV = destination[0]; // the number of V can have
        int numH = destination[1]; // the number of H can have
        int n = numH + numV; // total steps to get to the destination
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < n; i ++) {
            // corner case
            if(numH == 0) {
                answer.append('V');
                numV --;
                continue;
            }
            if(numV == 0) {
                answer.append('H');
                numH --;
                continue;
            }
            // all possible instructions
            int comb = combinations(n - i - 1, numV);
            if (k <= comb) {
                answer.append('H');
                numH--;
            } else {
                answer.append('V');
                k -= comb;
                numV--;
            }
        }
        return answer.toString();
    }
    // method to calculate aCb
    private int combinations(int a, int b) {
        long top = 1;
        long bottom = 1;

        for (int i = b + 1; i <= a; i++) {
            top *= i;
        }
        for (int i = 1; i <= a - b; i++) {
            bottom *= i;
        }
        return (int) (top / bottom);
    }
}
