package math.easy.Number_of_Steps_to_Reduce_a_Number_to_Zero_1342;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {

        int counter = 0;
        while (num != 0) {
            switch (num % 2) {
                case 0 -> {
                    num = num / 2;
                    counter++;
                }
                default -> {
                    num = num - 1;
                    counter++;
                }
            }
        }
        return counter;


    }
}
