import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class MaximumOrderVolume {

    static class Result {

        /*
         * Complete the 'phoneCalls' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY start
         *  2. INTEGER_ARRAY duration
         *  3. INTEGER_ARRAY volume
         */

        public static int phoneCalls(List<Integer> start, List<Integer> duration, List<Integer> volume) {
            // Write your code here
            List<Integer> end = new ArrayList<Integer>();
            int n = start.size();
            Call[] calls = new Call[n];
            for(int i = 0; i < n; i ++){
                end.add(start.get(i) + duration.get(i));
                Call call = new Call(start.get(i), end.get(i), volume.get(i));
                calls[i] = call;
            }
            Arrays.sort(calls, (c1, c2) -> (c1.end - c2.end));
            int[] dp = new int[n];
            for(int i = 0; i < n; i ++) {
                dp[i] = calls[i].volume;
            }
            for(int i = 0; i < n; i ++) {
                dp[i] = Math.max(dp[i - 1], calls[i].volume);
                for(int j = i - 1; j >= 0; j --) {
                    if(calls[j].end <= calls[i].start) {
                        dp[i] = Math.max(dp[j] + calls[i].volume, dp[i]);
                        break;
                    }
                }
            }
            return dp[n - 1];
        }
        static class Call {
            int start;
            int end;
            int volume;
            Call(int start, int end, int volume){
                this.start = start;
                this.end = end;
                this.volume = volume;
            }
        }
    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int startCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> start = IntStream.range(0, startCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            int durationCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> duration = IntStream.range(0, durationCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            int volumeCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> volume = IntStream.range(0, volumeCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = Result.phoneCalls(start, duration, volume);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
