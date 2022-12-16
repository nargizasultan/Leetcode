package Goal_Parser_Interpretation_1678;

public class Solution {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {

            switch (command.charAt(i)){
                case  'G'->  stringBuilder.append("G");
                case '('->{
                    if (command.charAt(i + 1) == ')') {
                        stringBuilder.append("o");
                        i++;
                    }
                }
                default -> {  stringBuilder.append("al");
                i = i + 2;}
            }
        }
        return stringBuilder.toString();

    }
}
