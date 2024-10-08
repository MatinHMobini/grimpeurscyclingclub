/**
 * This static class provides the current date in String format.
 */

package com.example.grimpeurscyclingclub;

import java.util.Calendar;

public class Date {


    /**
     * Code created by Callum Hill, December 18th, 2020: https://github.com/codeWithCal/DatePickerTutorial/tree/master
     *
     * */
    public static String getTodaysDate()
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return Date.makeDateString(day, month, year);
    }

    public static String makeDateString(int day, int month, int year)
    {
        return Date.getMonthFormat(month) + " " + day + " " + year;
    }

    public static String getMonthFormat(int month)
    {
        if(month == 1)
            return "JAN";
        if(month == 2)
            return "FEB";
        if(month == 3)
            return "MAR";
        if(month == 4)
            return "APR";
        if(month == 5)
            return "MAY";
        if(month == 6)
            return "JUN";
        if(month == 7)
            return "JUL";
        if(month == 8)
            return "AUG";
        if(month == 9)
            return "SEP";
        if(month == 10)
            return "OCT";
        if(month == 11)
            return "NOV";
        if(month == 12)
            return "DEC";

        //default should never happen
        return "JAN";
    }
}
