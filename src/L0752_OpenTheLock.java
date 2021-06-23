import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class L0752_OpenTheLock {
    public int openLock(String[] deadends, String target) {
        String start = "0000";
        Set<String> dead = new HashSet();
        for(String d : dead){
            dead.add(d);
        }
        if(dead.contains(start)) return -1;

        Queue<String> queue = new LinkedList();
        queue.offer(start);

        Set<String> visited = new HashSet<>();
        visited.add(start);

        int step = 0;
        while(!queue.isEmpty()){
            step ++;
            int size = queue.size();
            for(int s = 0; s < size; s ++) {
                String node = queue.poll();
                for(int i = 0; i < 4; i ++){
                    // 4 wheels per lock
                    for(int j = -1; j <= 1; j += 2){
                        // each wheel can rotate up and down
                        char[] chars = node.toCharArray();
                        //convert char to int and then convert back
                        // (0 - 1 + 10) % 10 = 9, 0 can rotate to 9 and 1
                        chars[i] = (char) (((chars[i] - '0') + j + 10) % 10 + '0');
                        // make a copy of current node
                        String next = new String(chars);
                        if(next.equals(target)) return step;
                        if(dead.contains(next) || visited.contains(next)) continue;
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
        }
        return -1;
    }
}
