package Delete_Columns_to_Make_Sorted_944;

public class Solution {
    public static void main(String[] args) {
        String[] str=new String[]{ "cba","daf","ghi"};
        System.out.println(minDeletionSize( str));

    }

    public static int minDeletionSize(String[] strs) {

        int K= strs[0].length();
        int counter=0;
        for (int i = 0; i < K; i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    counter++;
                    break;
                }

            }

        }
        return counter;

    }
}
