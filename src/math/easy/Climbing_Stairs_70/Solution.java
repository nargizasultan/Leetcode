package math.easy.Climbing_Stairs_70;

public class Solution {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }
        int current = 0;
        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;

        }
        return current;

    }
}
