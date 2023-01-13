package Symmetric_Tree_101;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2,new TreeNode(3), new TreeNode(4) ), new TreeNode(2,new TreeNode(4), new TreeNode(3) ));
        System.out.println(isSymmetric(root));
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

    public static boolean isSymmetric(TreeNode root) {
            return isMirror(root, root);

    }

    private static boolean isMirror(TreeNode root, TreeNode root1) {
        if(root==null && root1==null) return true;
        if(root==null || root1==null) return false;

        return root.val==root1.val && isMirror(root.left, root1.right) && isMirror(root.right, root1.left);

    }
}
