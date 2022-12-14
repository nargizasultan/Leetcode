package Running_Sum_of_1d_Array_1480;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {

        int[] newNums = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {

            newNums[i] = result + nums[i];
            result += nums[i];

        }
        return newNums;

    }
}
