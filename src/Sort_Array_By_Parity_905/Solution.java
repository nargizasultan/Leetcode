package Sort_Array_By_Parity_905;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums=new int[]{3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int []numbers=new int[nums.length];
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                numbers[counter]=nums[i];
                counter++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2!=0){
                numbers[counter]=nums[i];
                counter++;
            }
        }
        return numbers;

    }
}
