package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * */

public class Problem09 {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long min = scan.nextLong();
        long minutes = min;
        min /= 60*24;
        long year = min/365;
        long day = min%365;
        System.out.printf("%d minutes is approximately %d years and %d days\n", minutes, year, day);
    }
}
