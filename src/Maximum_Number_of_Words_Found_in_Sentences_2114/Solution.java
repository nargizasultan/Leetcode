package Maximum_Number_of_Words_Found_in_Sentences_2114;

public class Solution {
    public static void main(String[] args) {
        String[] sentences=new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));

    }

    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for (String sentence : sentences) {
            int length = sentence.split(" ").length;
            if(length>max){
                max=length;
            }
        }
        return max;


    }
}
