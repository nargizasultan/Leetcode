package Sign_of_the_Product_of_an_Array_1822;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{-41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41};
        System.out.println(arraySign(nums));
    }

    public static int arraySign(int[] nums) {
        int answer = 1;
        for (int num : nums) {

            if (num == 0) return 0;

            else if (num < 0) answer = -answer;
        }
        return answer;
    }
}
