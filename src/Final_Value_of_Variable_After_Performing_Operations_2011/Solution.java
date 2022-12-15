package Final_Value_of_Variable_After_Performing_Operations_2011;

public class Solution {
    public static void main(String[] args) {
        String[] operations = new String[]{"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int counter = 0;
        for (String operation : operations) {
            if (operation.equals("X++") ||operation.equals("++X")) {
                counter++;

            } else {
                counter--;
            }
        }
        return counter;

    }
}
