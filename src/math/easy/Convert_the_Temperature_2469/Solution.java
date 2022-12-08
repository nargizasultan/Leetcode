package math.easy.Convert_the_Temperature_2469;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));

    }

    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit  = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}
