package Excel_Sheet_Column_Number_171;

public class Solution {
    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));

    }
    public static int titleToNumber(String columnTitle) {

        int result=0;
        char[] chars = columnTitle.toCharArray();
        for (char aChar : chars) {
            int x=aChar-'A'+1;
            result=result*26+x;

        }
        return result;

    }
}
