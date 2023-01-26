package Merge_Two_Binary_Trees_617;

import com.sun.source.tree.Tree;

public class Solution {
    public static void main(String[] args) {

    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        TreeNode newTree=new TreeNode(root1.val+ root2.val);
        newTree.left=mergeTrees(root1.left, root2.left);
        newTree.right=mergeTrees(root1.right, root2.right);
        return newTree;


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
}