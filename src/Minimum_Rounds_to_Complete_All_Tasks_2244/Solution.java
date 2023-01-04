package Minimum_Rounds_to_Complete_All_Tasks_2244;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] tasks=new int []{2,2,3,3,2,4,4,4,4,4};
        System.out.println(minimumRounds(tasks));

    }

    public static int minimumRounds(int[] tasks) {

        HashMap<Integer, Integer>map=new HashMap<>();
        for (int a : tasks) {
            map.put(a, map.getOrDefault(a, 0)+1);

        }
        int res=0;
        for (Integer k : map.values()) {
            if(k==1) return -1;
            res+=(k+2)/3;
        }
        return res;

    }
}
