package Shuffle_the_Array_1470;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums=new int[]{2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] newNums=new int[nums.length];
        int index=0;
        for (int i = 0; i < nums.length; i++) {
           if(i%2!=0){
               newNums[i]=nums[n];
               n++;
           }else {
               newNums[i]=nums[index];
               index++;
           }

        }
        return newNums;

    }
}
