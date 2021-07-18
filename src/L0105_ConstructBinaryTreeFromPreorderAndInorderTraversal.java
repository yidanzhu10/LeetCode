import java.util.HashMap;

public class L0105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder == null || preorder == null || inorder.length != preorder.length) return null;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < inorder.length; i ++) {
            map.put(inorder[i], i);
            // value, index
        }
        return helper(preorder, inorder, 0, 0, inorder.length - 1, map);
    }
    private TreeNode helper(int[] preorder,
                            int[] inorder,
                            int preStart, // root
                            int inStart,
                            int inEnd, // the range of current subtree in preorder array
                            HashMap<Integer, Integer> map){
        if(inStart > inEnd || preStart >= preorder.length) {
            return null;
        }
        int rootIndex = map.get(preorder[preStart]);
        TreeNode root = new TreeNode(preorder[preStart]);

        root.left = helper(preorder, inorder,
                preStart + 1, inStart,
                rootIndex - 1,
                map);

        root.right = helper(preorder, inorder,
                preStart + rootIndex - inStart + 1,
                rootIndex + 1,
                inEnd, map);

        return root;
    }
}
