package com.auca;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem10 {
    private static final String[] srp = {"scissor", "rock", "paper"};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x,y;
        x = s.nextDouble();
        y = s.nextDouble();

        if(Math.sqrt(x*x+y*y)<=10)
            System.out.printf("Point (%.1f, %.1f) is in the circle\n", x,y);
        else
            System.out.printf("Point (%.1f, %.1f) is not in the circle\n", x,y);
    }
}
