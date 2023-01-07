package Gas_Station_134;

import javax.print.DocFlavor;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};

        System.out.println(canCompleteCircuit(gas, cost));


    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
       int total=0;
        int res=0;
        for (int i = 0; i < gas.length; i++) {
            total+=gas[i]-cost[i];
            if(total<0){
                res=i+1;
                total=0;
            }
        }
        return res;
    }
}
