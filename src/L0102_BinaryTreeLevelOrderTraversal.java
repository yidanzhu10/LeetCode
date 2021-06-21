import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L0102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        List<List<Integer>> res = new ArrayList();
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList();
            for(int i = 0; i < size; i ++) {
                TreeNode cur = queue.poll();
                level.add(cur.val);
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
            res.add(level);
        }
        return res;
    }
}
