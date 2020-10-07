package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * */

public class Problem10 {

    // Global variables
    private static long totalPopulation = 312032486;
    private static final long yearDays = 365;

    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int n = scan.nextInt();

        long yearSeconds = yearDays * 24 * 60 * 60; // Total seconds in one year

        for (int year = 0; year < n; year++)
        {
            totalPopulation += yearSeconds / 7;  // One birth every 7 seconds
            totalPopulation -= yearSeconds / 13; // One death every 13 seconds
            totalPopulation += yearSeconds / 45; // One new immigrant every 45 seconds
        }
        // Print updated total population of the United States
        System.out.printf("The population in %d years is %d\n", n, totalPopulation);
    }
}