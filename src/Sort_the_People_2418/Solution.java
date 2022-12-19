package Sort_the_People_2418;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        String[] strings = new String[names.length];

        Map<Integer, String> peoples = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            peoples.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            strings[index] = peoples.get(heights[i]);
            index++;
        }
        return strings;


    }
}
