package Binaryz_Tree_Preorder_Traversal_144;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(preorderTraversal(root));
        System.out.println(preorderTraversalRecursively(root));


    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return list;

        stack.add(root);
        while (!stack.isEmpty()) {

            TreeNode pop = stack.pop();
            list.add(pop.val);
            if (pop.right != null) {
                stack.add(pop.right);
            }
            if (pop.left != null) {
                stack.add(pop.left);
            }
        }
        return list;

    }
    public static List<Integer> preorderTraversalRecursively(TreeNode root) {
       return dfs(root, new ArrayList<>());

    }
    private static List<Integer>dfs(TreeNode root, List<Integer>list){
        if(root==null){
            return list;
        }
        list.add(root.val);
        list=dfs(root.left, list);
        return dfs(root.right, list);
    }
}
