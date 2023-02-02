package Greatest_Common_Divisor_of_Strings_1071;



public class Solution {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));

    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gsd = gsd(str1.length(), str2.length());
        return str2.substring(0, gsd);


    }

    private static int gsd(int n1, int n2) {
        if (n2 == 0) return n1;
        return gsd(n2, n1 % n2);

    }
}
