package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * "What is your name?"
 *
 * */

public class Problem03 {
    // Global variables
    private static String name; // User name
    private static Scanner scanner; // Scans user input
    // Main
    public static void main(String[] args)
    {
        scanner = new Scanner(System.in); // Init scanner
        System.out.print("What is your name?\t"); // Ask for user's name
        name = scanner.nextLine(); // Read String line from command line
        System.out.println("Hello, "+name+"!"); // Greet the user
    }
}

