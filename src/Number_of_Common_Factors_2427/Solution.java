package Number_of_Common_Factors_2427;

public class Solution {
    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
    }

    public static int commonFactors(int a, int b) {
        int min = Integer.min(a, b);
        int counter=0;
        for (int i = 1; i <=min ; i++) {
            if(a%i==0 && b%i==0){
                counter++;
            }
            
        }
        return counter;

    }
}
