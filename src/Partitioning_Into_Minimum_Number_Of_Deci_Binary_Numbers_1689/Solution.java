package Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers_1689;

public class Solution {
    public static void main(String[] args) {

        System.out.println(minPartitions("82734"));

    }

    public static int minPartitions(String n) {
        int max=0;
        for (char c : n.toCharArray()) {
            int i = c - '0';
            if(i>max){
                max=i;
            }
        }
        return max;

    }
}
