package Day_of_the_Year_1154;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));

    }

    public static int dayOfYear(String date) {
        GregorianCalendar calendar = new GregorianCalendar();
        LocalDate localDate = LocalDate.parse(date);
        int month = localDate.getMonth().getValue();
        int dayOfMonth = localDate.getDayOfMonth();
        int year = localDate.getYear();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int counter = 0;
        for (int i = 0; i < month - 1; i++) {
            counter += days[i];
        }
        if (month == 1 || month == 2) {
            return counter + dayOfMonth;
        }
        if (calendar.isLeapYear(year)) {
            return counter + dayOfMonth + 1;

        } else {
            return counter + dayOfMonth;
        }


    }

}
