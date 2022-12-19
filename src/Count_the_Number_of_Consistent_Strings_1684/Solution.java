package Count_the_Number_of_Consistent_Strings_1684;

public class Solution {
    public static void main(String[] args) {
        String allowed="ab";
        String[] words=new String[]{"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed, words));

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int counter=0;
        for (String word : words) {
            boolean isValid=true;
            for (char c : word.toCharArray()) {
                if(!allowed.contains(String.valueOf(c))){
                    isValid=false;
                }

            }
            if(isValid) counter++;
        }
        return counter;

    }
}
