package Same_Tree_100;

public class Solution {
    public static void main(String[] args) {
        TreeNode p=new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q=new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(p, q));

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
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null){
            return true;
        }else if(p==null || q==null){
            return false;
        }
        else if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);

    }
}
