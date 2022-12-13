package Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281;

public class Solution {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int a = 1;
        int b = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {

            Integer integer = Integer.valueOf(Character.toString(s.charAt(i)));
            a *= integer;
            b += integer;

        }
        return a - b;
    }
}
