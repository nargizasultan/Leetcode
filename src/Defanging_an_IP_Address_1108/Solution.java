package Defanging_an_IP_Address_1108;

public class Solution {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {

        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < address.length(); i++) {

            if (address.charAt(i) == '.') {

                stringBuilder.append("[.]");
            }else {
                stringBuilder.append(address.charAt(i));
            }

        }

       return stringBuilder.toString();


    }
}
