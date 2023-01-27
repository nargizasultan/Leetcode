package Sum_of_Left_Leaves_404;

import java.util.Stack;

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

    public static int sumOfLeftLeaves3(TreeNode root) {

       Stack<TreeNode>stack=new Stack<>();
       int sum=0;
       stack.add(root);
       while(!stack.isEmpty()){
           TreeNode node = stack.pop();
           if(node==null){
               continue;
           }
           else if(node.left!=null && node.left.left==null && node.left.right==null){
               sum+=node.left.val;
           }
           stack.add(node.left);
           stack.add(node.right);
       }
       return sum;
    }
   static int ans=0;
    public static int sumOfLeftLeaves2(TreeNode root) {

      if(root==null)return 0;

      if(root.left!=null && root.left.left==null && root.left.right==null){
          ans+=root.left.val;
      }
      sumOfLeftLeaves2(root.left);
      sumOfLeftLeaves2(root.right);
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
