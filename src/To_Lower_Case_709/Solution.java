package To_Lower_Case_709;

public class Solution {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));

    }

    public static String toLowerCase(String s) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 'a' - 'A';
            }
        }
        return String.valueOf(chars);

    }
}
