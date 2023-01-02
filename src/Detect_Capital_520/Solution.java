package Detect_Capital_520;

public class Solution {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("gjkl"));
    }

    public static boolean detectCapitalUse(String word) {
        int counter=0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)>='A'&&  word.charAt(i)<='Z'){
                counter++;
            }
        }
        if(word.length()==counter){
            return true;
        } else if (counter==0) {
            return true;
        }else if (counter==1 &&(word.charAt(0)>'A'&&  word.charAt(0)<'Z') ){
            return true;
        }else {
            return false;
        }

    }
}
