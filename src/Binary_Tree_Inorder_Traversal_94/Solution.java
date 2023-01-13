package Binary_Tree_Inorder_Traversal_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(inorderTraversal(root));
        System.out.println(inorderTraversalRecursively(root));
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

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return list;

        }
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;

    }

    public static List<Integer> inorderTraversalRecursively(TreeNode root) {
        return dfs(root, new ArrayList<>());

    }

    private static List<Integer> dfs(TreeNode root, List<Integer> list) {

        if (root==null){
            return list;
        }
        list=dfs(root.left, list);
        list.add(root.val);
        return dfs(root.right, list);
    }

}
