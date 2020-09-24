package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * */

public class Problem08 {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = scan.nextDouble()   ;
        double kg = pounds*0.454;
        System.out.printf("%.1f pounds is %.3f kilograms\n", pounds, kg);
    }
}
