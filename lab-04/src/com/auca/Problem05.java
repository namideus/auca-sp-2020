package com.auca;

import java.util.Scanner;

public class Problem05 {
    private static final int[] monthDays = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Year? ");
        int year = s.nextInt();

        if(year<1)
        {
            System.out.println(year + " is not a correct year!");
            System.exit(2);
        }

        System.out.print("Month? ");
        int month = s.nextInt();

        if(month<1 || month>12)
        {
            System.out.println(month + " is not a correct month!");
            System.exit(2);
        }

        int days = (month==2 && isLeapYear(year)) ? monthDays[month-1]+1 : monthDays[month-1];

        System.out.println("Number of days: "+days);
    }

    // Is leap year
    private static boolean isLeapYear(int year)
    {
        return year%4==0 && year%100>0 || year%400==0;
    }
}
