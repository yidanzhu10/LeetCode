import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class L0752_OpenTheLock {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        for(String d : deadends) dead.add(d);

        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        Queue<String> visited = new LinkedList();
        visited.add("0000");

        int step = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i ++){
                String node = queue.poll();
                if(node.equals(target)) {
                    return step;
                }
                if(dead.contains(node)) continue;
                // 4 wheels per lock
                for(int j = 0; j < 4; j ++) {
                    // each wheel can rotate up and down
                    for(int d = -1; d <= 1; d += 2) {
                        //convert char to int and then convert back
                        // (0 - 1 + 10) % 10 = 9, 0 can rotate to 9 and 1
                        int y = ((node.charAt(j) - '0') + d + 10) % 10;
                        // the number after rotating up pr down
                        String next = node.substring(0, j) + ("" + y) + node.substring(j + 1);
                        if(!visited.contains(next)){
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                }
            }
            step ++;
        }
        return -1;
    }
}
