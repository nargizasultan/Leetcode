package Peak_Index_in_a_Mountain_Array_852;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;

        while (left<right){
            int mid=left+(right-left)/2;

            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;


    }
}
