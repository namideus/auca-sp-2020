package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * */

public class Problem07 {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scan.nextDouble();
        double length = scan.nextDouble();
        double area = radius*radius*Math.PI;
        double volume = area*length;
        System.out.printf("The area is %.4f\nThe volume is %.1f\n", area, volume);
    }
}
