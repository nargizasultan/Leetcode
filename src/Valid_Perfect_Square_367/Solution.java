package Valid_Perfect_Square_367;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));

    }

    public static boolean isPerfectSquare(int num) {
        int left=1;
        int right=num;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(mid*mid==num){
                return true;
            } else if (mid<num/mid) {
                left=mid+1;

            }else {
                right=mid-1;
            }

        }
        return false;


    }
}
