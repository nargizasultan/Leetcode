package math.easy.Smallest_Even_Multiple_2413;

public class Solution {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }

    public static int smallestEvenMultiple(int n) {

        if (n % 2 == 0) {
            return n;
        } else {
            return n * 2;
        }
    }
}
