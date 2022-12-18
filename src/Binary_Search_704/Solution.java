package Binary_Search_704;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};

        System.out.println(search(nums, 9));
    }

    public static int search(int[] nums, int target) {

       int left=0;
       int right=nums.length-1;
       while (left<=right){
           int mid=(right+left)/2;
           if(nums[mid]<target){
               left=mid+1;
           }else if(nums[mid]>target){
               left=mid-1;
           }else {
               return mid;
           }
       }
       return -1;

    }
}
