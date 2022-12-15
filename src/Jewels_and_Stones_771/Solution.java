package Jewels_and_Stones_771;

public class Solution {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int counter=0;
        for (char c : jewels.toCharArray()) {
            for (char c1 : stones.toCharArray()) {
                if(c==c1){
                    counter++;
                }
            }

        }
        return counter;

    }
}
