package com.auca;

/**
 * @author Yiman
 *
 * "Population projection" program
 *
 * */

public class Problem10 {

    // Global variables
    private static long totalPopulation = 312032486;
    private static final long yearDays = 365;

    // Main
    public static void main(String[] args) {

        int n = 1;
        long yearSeconds = yearDays*24*60*60; // Total seconds in one year

        for(int period = 0; period < n; period++) {
            for (int year = 0; year < 5; year++) {
                totalPopulation += yearSeconds / 7;  // One birth every 7 seconds
                totalPopulation -= yearSeconds / 13; // One death every 13 seconds
                totalPopulation += yearSeconds / 45; // One new immigrant every 45 seconds
            }
        }

        // Print updated total population of the United States
        System.out.println("Population after " + (n*5) + " years: " + totalPopulation);
    }

}

