package Concatenation_of_Array_1929;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {

        int[] result = new int[nums.length * 2];
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[length + i] = nums[i];
        }

        return result;


    }
}
