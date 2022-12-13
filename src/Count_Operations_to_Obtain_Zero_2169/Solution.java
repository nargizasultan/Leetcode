package Count_Operations_to_Obtain_Zero_2169;

public class Solution {
    public static void main(String[] args) {
        System.out.println(countOperations(2, 3));
    }

    public static int countOperations(int num1, int num2) {
        int counter = 0;
        while (num1!=0 && num2!=0){
            if (num1 > num2) {
                num1 = num1 - num2;
                counter++;

            } else  {
                num2 = num2 - num1;
                counter++;
            }
        }
        return counter;


    }
}
