package udemy;

import java.util.*;

public class L46_Permutation {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> output = new ArrayList<>();
        if(nums.length == 0 || nums == null) {
            return output;
        }

        Deque<Integer> path = new ArrayDeque<>();
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, path, used, output);
        return output;
    }

    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> output) {
        if(depth == len) {
            output.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i < len; i ++) {
            if(used[i]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, path, used, output);
            path.removeLast();
            used[i] = false;
        }
    }
}
