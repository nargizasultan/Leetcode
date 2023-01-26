package Sum_of_Left_Leaves_404;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(sumOfLeftLeaves(root));

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;

        } else if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }else{
           return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }



    }
    public static int sumOfLeftLeaves1(TreeNode root) {

       if(root==null) return 0;
       int ans=0;
       if(root.left!=null){
           if(root.left.left==null && root.left.right==null){
               ans+=root.left.val;
           }
           else{
              ans+= sumOfLeftLeaves1(root.left);
           }

       }
        ans+=sumOfLeftLeaves1(root.right);
       return ans;
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
