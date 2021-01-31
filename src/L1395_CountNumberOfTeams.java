public class L1395_CountNumberOfTeams {
    // Brute force
    public int numTeams(int[] rating) {
        int count = 0;
        int n = rating.length;
        for(int i = 0; i < n - 2; i ++) {
            for(int j = i + 1; j < n - 1; j ++) {
                for(int k = j + 1; k < n; k ++) {
                    if(rating[i] < rating[j] && rating[j] < rating[k]) {
                        count ++;
                    }
                    if(rating[i] > rating[j] && rating[j] > rating[k]) {
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public int numTeams2(int[] rating) {
         int n = rating.length;
         int ans = 0;
         for(int j = 0; j < n; j ++) {
             int l = 0;
             int r = 0;
             for(int i = 0; i < j; i ++) {
                 if(rating[i] < rating[j]) {
                     l ++;
                 }
             }
             for(int k = j + 1; k < n; k ++) {
                 if(rating[j] < rating[k]) r++;
             }
             ans += (l * r) + (j - l) * (n - 1 - j - r);
         }
         return ans;
    }
}
