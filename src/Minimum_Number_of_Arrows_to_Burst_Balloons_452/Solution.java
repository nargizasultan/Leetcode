package Minimum_Number_of_Arrows_to_Burst_Balloons_452;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));

    }

    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, (point1, point2) -> Integer.compare(point1[1], point2[1]));

        int counter =1;
        int pos=points[0][ 1];
        for (int i = 1; i < points.length; i++) {
            if(pos>=points[i][0]){
                continue;
            }
            counter++;
            pos=points[i][1];

        }
        return counter;


    }
}
