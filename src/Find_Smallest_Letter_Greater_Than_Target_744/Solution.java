package Find_Smallest_Letter_Greater_Than_Target_744;



public class Solution {
    public static void main(String[] args) {
        char[] letters = new char[]{'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;
        char result = letters[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] == target) {
                left = mid + 1;
            } else if (letters[mid] < target) {
                left = mid + 1;
            } else if (letters[mid] > target) {
                result = letters[mid];
                right = mid - 1;
            }
        }
        return result;


    }
}
