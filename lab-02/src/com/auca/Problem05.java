package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * */

public class Problem05 {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Temperature in degrees Fahrenheit? ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit-32.0)*(5/9.0);
        System.out.printf("The temperature in degrees Celsius is %.2f\n", celsius);
    }
}
