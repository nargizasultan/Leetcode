package math.easy.A_Number_After_a_Double_Reversal_2119;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));

    }

    public static boolean isSameAfterReversals(int num) {
        int reverse = reverse(num);
        int reverse1 = reverse(reverse);
        return num==reverse1;


    }
    public static int reverse(int num){
        int reverseNum = 0;

        while (num > 0) {
            reverseNum = reverseNum * 10 + (num % 10);
            num = num / 10;
        }
        return reverseNum;


    }
}
