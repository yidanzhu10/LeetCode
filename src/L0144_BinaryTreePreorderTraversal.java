import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L0144_BinaryTreePreorderTraversal {
    class Solution {
        // recursion
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if(root == null) {
                return res;
            }
            helper(res, root);
            return res;
        }
        private void helper(List<Integer> res, TreeNode root) {
            if(root == null) return;
            res.add(root.val);
            helper(res, root.left);
            helper(res, root.right);
        }
        // iterative
        public List<Integer> preorderTraversal2(TreeNode root){
            List<Integer> res = new ArrayList<>();
            if(root == null) return res;

            Stack<TreeNode> stack = new Stack();
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode t = stack.pop();
                if(t.right != null){
                    stack.push(t.right);
                }
                if(t.left != null) {
                    stack.push(t.left);
                }
                res.add(t.val);
            }
            return res;
        }
    }
}
