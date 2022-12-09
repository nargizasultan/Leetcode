package medium.Reverse_Integer_7;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(153));

    }

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            int newResult = result * 10 + lastDigit;
            if ((newResult -lastDigit)/10 != result) {
                return 0;
            }

            x = x / 10;
            result = newResult;
        }
        return result;


    }
}
