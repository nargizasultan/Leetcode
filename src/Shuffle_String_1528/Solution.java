package Shuffle_String_1528;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));

    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = indices.length;
        char[]newString=new char[length];
        for (int i = 0; i < length; i++) {
            newString[indices[i]]=s.charAt(i);

        }
        for (char c : newString) {
            stringBuilder.append(c);
        }

       return stringBuilder.toString();

    }
}
