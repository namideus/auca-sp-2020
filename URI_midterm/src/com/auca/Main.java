package com.auca;

import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble(); // Radius
        double A = Math.PI*r*r; // Area of circle
        System.out.printf("A=%.4f\n", A); // Print result
    }
}
