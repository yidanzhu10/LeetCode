import java.util.ArrayList;
import java.util.List;

public class L0145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        if(root == null) return res;
        helper(res, root);
        return res;
    }

    private void helper(List<Integer> res, TreeNode root) {
        if(root == null) return;
        helper(res, root.left);
        helper(res, root.right);
        res.add(root.val);
    }
}
