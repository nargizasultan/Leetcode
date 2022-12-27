package Check_if_the_Sentence_Is_Pangram_1832;

public class Solution {
    public static void main(String[] args) {
       String sentence = "qwertyuiopasdfghjklzxcvbn";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];

        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }

        for(boolean existLetter : letters) {
            if(!existLetter) return false;
        }

        return true;

    }
}
