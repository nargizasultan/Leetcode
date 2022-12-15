package Two_Sum_1;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int []nums =new int[] {2,7,11,15};
        int k=9;
        System.out.println(Arrays.toString(twoSum(nums, k)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int length = nums.length;
        for (int i = 0; i < length; i++) {

            for (int k = i+1; k < length; k++) {
                if(nums[i]+nums[k]==target){
                    return new int[]{i, k};
                }
            }
        }

        return null;
    }
}
