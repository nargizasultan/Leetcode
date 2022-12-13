package Find_Greatest_Common_Divisor_of_Array_1979;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 6, 9, 10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {

        int smallestNumber = nums[0];
        int largestNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallestNumber) {
                smallestNumber = nums[i];
            }
            if (nums[i] > largestNumber) {
                largestNumber = nums[i];
            }

        }

        for (int i = smallestNumber; i <= smallestNumber; i--) {
            if (smallestNumber % i == 0 && largestNumber % i == 0) {
                return i;

            }

        }


        return 1;
    }
}
