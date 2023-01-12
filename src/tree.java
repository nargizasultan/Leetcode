import java.util.Stack;

public class tree {
    public static void main(String[] args) {
        Tree root = new Tree(20, new Tree(7, new Tree(4, null, new Tree(6)),
                new Tree(9)), new Tree(35, new Tree(31, new Tree(28), null), new Tree(40, new Tree(38), new Tree(52))));

        System.out.println(root.sum());
        System.out.println(sumDeep(root));

    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        public int sum() {
            int sum = value;
            if (left != null) {
                sum += left.sum();
            }
            if (right != null) {
                sum += right.sum();
            }
            return sum;
        }
    }

    public static int sumDeep(Tree root) {

        Stack<Tree> stack = new Stack<>();
        int sum=0;
        stack.push(root);
        while (!stack.isEmpty()){
            Tree pop = stack.pop();
            sum+= pop.value;
            if(pop.right!=null){
                stack.push(pop.right);
            }
            if(pop.left!=null){
                stack.push(pop.left);
            }

        }
        return sum;

    }

}
