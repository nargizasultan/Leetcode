package Build_Array_from_Permutation_1920;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int []nums = new int[]{0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int length = nums.length;
        int []ans=new int[length];
        for (int i = 0; i <length; i++) {
            ans[i] = nums[nums[i]];
        }
       return ans;

    }
}
