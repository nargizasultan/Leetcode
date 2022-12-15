package Kids_With_the_Greatest_Number_of_Candies_1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] candies=new int[]{2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>booleans=new ArrayList<>();
        int max=0;
        for (int candy : candies) {
            if(candy>max){
                max=candy;
            }
        }
        for (int candy : candies) {
            if(candy+extraCandies>=max){
                booleans.add(true);
            }else {
                booleans.add(false);
            }
        }
        return booleans;



    }
}
