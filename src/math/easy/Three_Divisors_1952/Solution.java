package math.easy.Three_Divisors_1952;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isThree(4));
    }

    public static boolean isThree(int n) {

        if(n<3){
            return false;
        }
        int counter=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                counter++;
            }

        }
        return counter == 3;
    }
}
