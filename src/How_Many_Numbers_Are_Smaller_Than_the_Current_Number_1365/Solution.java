package How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
      int[]  nums = new int[]{8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newNums=new int[nums.length];
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if(nums[i]>num){
                    counter++;
                    newNums[i]=counter;
                }
            }
            counter=0;

        }
        return newNums;

    }
}
