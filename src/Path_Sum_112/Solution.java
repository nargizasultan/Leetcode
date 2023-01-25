package Path_Sum_112;


public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7),
                        new TreeNode(2)), null), new TreeNode(8, new TreeNode(13),
                new TreeNode(4, null, new TreeNode(1))));
        System.out.println(hasPathSum(root, 22));


    }

    public static boolean hasPathSum(TreeNode root, int sum) {

       if(root==null){
           return false;
       }
       if(root.left==null && root.right==null){
           return root.val==sum;
       }
       return hasPathSum(root.left, sum- root.val) || hasPathSum(root.right, sum-root.val);

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
