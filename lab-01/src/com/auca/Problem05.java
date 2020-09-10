package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * “Operations on Two Doubles”
 *
 * */

public class Problem05 {

    // Global variables
    private static Scanner scanner;
    private static double a;
    private static double b;

    // Main
    public static void main(String[] args)
    {
        scanner = new Scanner(System.in); // Init scanner
        System.out.print("1st double? "); a = scanner.nextDouble(); // Enter the first double
        System.out.print("2nd double? "); b = scanner.nextDouble(); // Enter the second double
        System.out.println(a+" + "+b + " = " + (a+b)); // Addition
        System.out.println(a+" - "+b + " = " + (a-b)); // Subtraction
        System.out.println(a+" * "+b + " = " + (a*b)); // Multiplication
        System.out.println(a+" / "+b + " = " + (a/b)); // Division
        System.out.println(a+" % "+b + " = " + (a%b)); // Modulo
    }
}

