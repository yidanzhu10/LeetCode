import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class L0279_PerfectSquares {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList();
        if(n > 0) queue.offer(n);
        Set<Integer> seen = new HashSet();

        int count = 0;

        while(!queue.isEmpty()){
            count ++;
            int size = queue.size();
            for(int i = 0; i < size; i ++) {
                int cur = queue.poll();
                if(!seen.add(cur)) continue;

                for(int j = 1; j <= Math.sqrt(cur); j ++) {
                    if(cur - j * j == 0) return count;
                    //when count is returned, cur is the largest squared number
                    queue.offer(cur - j * j);
                }
            }
        }
        return count;
    }
}
