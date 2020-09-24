package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * */

public class Problem06 {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        int celsius = scan.nextInt();
        double fahrenheit = (9*celsius)/5.0+32;
        System.out.printf("%d Celsius is %.1f Fahrenheit\n", celsius, fahrenheit);
    }
}
