package Binary_Tree_Postorder_Traversal_145;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(postorderTraversal(root));

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList<>());
    }
    private static List<Integer>dfs(TreeNode root, List<Integer>list){
        if(root==null){
            return list;
        }
        list=dfs(root.left, list);
        list=dfs(root.right, list);
        list.add(root.val);
        return list;
    }
}
