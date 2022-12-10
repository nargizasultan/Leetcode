package math.Sqrt_x_69;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mySqrt(9));

    }
    public static int mySqrt(int x) {
       int left=0;
       int right=x;
     
       while(right>=left){
           int mid=(left+right)/2;
           if(mid*mid>x){
               right=mid-1;
           }else {
               left=mid+1;

           }
       }
       return left-1;

    }
}
