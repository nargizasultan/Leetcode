package Maximum_Ice_Cream_Bars_1833;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int []costs =new int[]{1,3,2,4,1};
        System.out.println(maxIceCream(costs, 7));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int counter=0;
        for (int cost : costs) {
            if(cost>coins){
                return counter;
            }else {
                counter++;
                coins-=cost;
            }
        }
        return counter;


    }
}
