import java.util.LinkedList;

public class L1409_QueriesOnAPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        int len = queries.length;
        int[] ans = new int[len];
        int[] P = new int[m];
        for(int i = 0; i < m; i ++) {
            P[i] = i + 1;
        }
        for(int j = 0; j < len; j ++) {
            int pos = 0;
            for(int i = 0; i < m; i ++) {
                if(P[i] != queries[j]){
                    continue;
                }
                pos = i;
            }
            ans[j] = pos;
            for(int k = pos; k >= 1; k --) {
                P[k] = P[k - 1];
            }
            P[0] = queries[j];
        }
        return ans;
    }
    public int[] processQueries2(int[] queries, int m) {
        LinkedList<Integer> P = new LinkedList<>();
        for (int i=1; i<=m;i++)
            P.add(i);

        int[] res = new int[queries.length];

        for (int i=0; i<queries.length; i++) {
            int q = queries[i];
            int idx = P.indexOf(q);
            int val = P.get(idx);
            P.remove(idx);
            P.addFirst(val);
            res[i] = idx;
        }

        return res;
    }
}
