package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * “Operations on Two Integers”
 *
 * */

public class Main
{
     // Global variables
    private static Scanner scanner;
    private static int a;
    private static int b;
    // Main
    public static void main(String[] args)
    {
        scanner = new Scanner(System.in); // Init scanner
        System.out.print("1st int? "); a = scanner.nextInt(); // Enter the first integer
        System.out.print("2nd int? "); b = scanner.nextInt(); // Enter the second integer
        System.out.println(a+" + "+b + " = " + (a+b)); // Addition
        System.out.println(a+" - "+b + " = " + (a-b)); // Subtraction
        System.out.println(a+" * "+b + " = " + (a*b)); // Multiplication
        System.out.println(a+" / "+b + " = " + (a/b)); // Division
        System.out.println(a+" % "+b + " = " + (a%b)); // Modulo
    }
}
