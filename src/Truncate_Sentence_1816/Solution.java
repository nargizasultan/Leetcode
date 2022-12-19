package Truncate_Sentence_1816;

public class Solution {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));

    }

    public static String truncateSentence(String s, int k) {
        StringBuilder stringBuilder=new StringBuilder();
        String[] strings = s.split(" ");
        int i;
        for ( i = 0; i < k-1; i++) {
           stringBuilder.append(strings[i]+" ");

        }
        stringBuilder.append(strings[i]);
        return stringBuilder.toString();


    }
}
