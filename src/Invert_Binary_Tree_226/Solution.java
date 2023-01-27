package Invert_Binary_Tree_226;

import com.sun.source.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(invertTree(root));
        Queue<Integer> stack=new LinkedList<>();
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println(stack);
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());



    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;

    }

    public static TreeNode invertTreeDfs(TreeNode root) {
        //DFS   //it's no so much scalable
        if (root==null)return null;
        TreeNode right=root.right;
        TreeNode left=root.left;
        root.left=invertTreeDfs(right);
        root.right=invertTreeDfs(left);
        return root;

    }

    public static TreeNode invertTree3(TreeNode root) {
        //dfs
       if(root==null)return null;
       Queue<TreeNode> queue=new LinkedList();
       queue.add(root);
       while (!queue.isEmpty()){
           TreeNode node = queue.poll();
           TreeNode left=node.left;
           node.left=node.right;
           node.right=left;
           if(node.left!=null){
               queue.add(node.left);
           }
           if(node.right!=null){
               queue.add(node.right);
           }
       }
       return root;


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
