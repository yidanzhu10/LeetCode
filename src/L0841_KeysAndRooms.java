import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L0841_KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet();
        dfs(rooms, 0, visited);
        return visited.size() == rooms.size();
    }
    private void dfs(List<List<Integer>> rooms, int cur, Set<Integer> visited){
        if(visited.contains(cur)) return;
        visited.add(cur);
        for(int next : rooms.get(cur)){
            dfs(rooms, next, visited);
        }
    }
}
