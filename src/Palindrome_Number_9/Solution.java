package Palindrome_Number_9;

public class Solution {
    public static void main(String[] args) {
        int x=-121;
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x) {

        char a;
        char b;

        String s = Integer.toString(x);
        char[] chars = s.toCharArray();
        int j= chars.length-1;

        for (int i = 0; i < chars.length; i++, j--) {
            a=chars[i];
            b=chars[j];
            if(!Character.getName(a).equals(Character.getName(b))){
                return false;
            }
        }
        return true;

    }

}
