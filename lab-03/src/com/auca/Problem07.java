package com.auca;

import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem07 {

    static final String[] weekDays = new String[] {
            "Sunday","Monday","Tuesday","Wednesday",
            "Thursday", "Friday","Saturday"
    };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int today, futureDay;
        System.out.print("Enter today's day: ");
        today = s.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        futureDay = s.nextInt();

        if(futureDay<7)
            futureDay+=today;

        if(futureDay>7)
            futureDay = (futureDay+today)%7;

        System.out.printf("Today is %s and the future day is %s\n", weekDays[today], weekDays[futureDay]);
    }
}
