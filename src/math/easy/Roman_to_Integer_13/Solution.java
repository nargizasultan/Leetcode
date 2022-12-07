package math.easy.Roman_to_Integer_13;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        String s = "IX";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {

        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            switch (Character.toString(chars[i])) {
                case "I" -> numbers.add(1);
                case "V" -> numbers.add(5);
                case "X" -> numbers.add(10);
                case "L" -> numbers.add(50);
                case "C" -> numbers.add(100);
                case "D" -> numbers.add(500);
                case "M" -> numbers.add(1000);

            }
        }

        if (numbers.size() == 1) {

            return numbers.get(0);
        } else {

            for (int i = 0; i < numbers.size()-1; i++) {

                if (numbers.get(i) < numbers.get(i + 1)) {
                    sum -= numbers.get(i);
                } else {
                    sum += numbers.get(i);
                }
            }

            return sum+numbers.get(numbers.size()-1);
        }
    }
}
