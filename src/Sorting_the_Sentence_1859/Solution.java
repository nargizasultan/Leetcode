package Sorting_the_Sentence_1859;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {


        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String elem : str) {
            i = (elem.charAt(elem.length() - 1) - '0');
            res[i-1]=elem.substring(0, elem.length()-1);
        }
        for ( i= 0; i < res.length-1; i++) {
            sb.append(res[i]+" ");
        }
        sb.append(res[i]);
        return sb.toString();

    }
}
