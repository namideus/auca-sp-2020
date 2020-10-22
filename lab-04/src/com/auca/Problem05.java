package com.auca;

import java.util.Scanner;

public class Problem05 {
    private static final int[] monthDays = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Year? ");
        int year = s.nextInt();

        System.out.print("Month? ");
        int month = s.nextInt();
        int days;

        if(month==2 && isLeapYear(year))
            days = monthDays[month-1]+1;
        else
            days = monthDays[month-1];

        System.out.println("Number of days: "+days);
    }

    // Is leap year
    private static boolean isLeapYear(int year)
    {
        return year%4==0 && year%100>0 || year%400==0;
    }
}
