/*
 * Ways to Sum
 * An automated packaging system is responsible for packing service.
 * A bos is certified to hold a certain weight. Given an integer total, calculate the number
 * of possible ways to achieve total as a sum of the weights of items weighing integer
 * weights from 1 to k, inclusive.
 *
 * Example: total = 8, k = 2
 * To reach a weight of 8, there are 5 different ways
 * that items with weights between 1 and 2 can be combined:
 * [1, 1, 1, 1, 1, 1, 1, 1]
 * [1, 1, 1, 1, 1, 1, 2]
 * [1, 1, 1, 1, 2, 2]
 * [1, 1, 2, 2, 2]
 * [2, 2, 2, 2]
 *
 * int total: the value to sum to
 * int k: the maximum of the range of integers to consider when summing to total
 * Returns:
 * int: the number of ways to sum the total; the number might be very large,
 * so return the integer modulo 1000000007 (10^9 + 7)
 * Constraints: 1 <= total <=1000; 1 <= k <= 100
 *
 */
class WaysToSum {
    public static int ways(int total, int k) {
        int[][] dp = new int[k + 1][total + 1];
        for(int i = 1; i <= total; i ++) {
            dp[1][i] = 1;
        }
        for(int i = 1; i <= k; i ++) {
            dp[i][0] = 1;
        }
        for(int i = 2; i <= k; i ++) {
            for(int j = 1; j <= total; j ++) {
                if(j >= i) {
                    dp[i][j] = (dp[j][j - 1] + dp[i - 1][j]) % 1000000007;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[k][total];
    }
}
class Solution{
    // driver code
}
