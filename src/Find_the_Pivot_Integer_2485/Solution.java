package Find_the_Pivot_Integer_2485;

public class Solution {
    public static void main(String[] args) {
        System.out.println(pivotInteger(1));

    }

    public static int pivotInteger(int n) {
        int left = 0;

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        int right = sum;

        for (int i = 0; i <=n; i++) {

            left += i;
            if (left == right) {
                return i;
            }
            right = sum - left;

        }
        return -1;

    }
}
