package Sqrt_x_69;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mySqrt(1));

    }

    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        if (x == 0) {
            return 0;
        }
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;

            }
        }
        return left - 1;

    }
}
