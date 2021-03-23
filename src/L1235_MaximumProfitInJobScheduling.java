import java.util.Arrays;

public class L1235_MaximumProfitInJobScheduling {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Job[] jobs = new Job[n];
        for(int i = 0; i < n; i ++) {
            Job job = new Job(startTime[i], endTime[i], profit[i]);
            jobs[i] = job;
        }
        Arrays.sort(jobs, (j1, j2) -> (j1.end - j2.end));
        // j1 and j2 are two elements in jobs, they are compared by their ends
        int[] dp = new int[n];
        for(int i = 0; i < n; i ++) {
            dp[i] = jobs[i].profit;
        }
        for(int i = 1; i < n; i ++) {
            // if dp[i] and dp[i - 1] have overlap, get the bigger one
            dp[i] = Math.max(dp[i - 1], jobs[i].profit);
            for(int j = i - 1; j >= 0; j --) {
                if(jobs[j].end <= jobs[i].start) {
                    // find the nearest j to i without overlap, get the bigger profit
                    dp[i] = Math.max(dp[j] + jobs[i].profit, dp[i]);
                    // the first time got biggest profit with j is always the biggest, so break
                    break;
                }
            }
        }
        return dp[n - 1];
    }
    class Job {
        int start;
        int end;
        int profit;

        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
}
