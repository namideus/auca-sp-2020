package com.auca;

import java.util.Scanner;

public class Problem09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a,b,c, p = 0;
        System.out.print("Enter 1st edge: ");
        a = s.nextDouble();
        System.out.print("Enter 2nd edge: ");
        b = s.nextDouble();
        System.out.print("Enter 3rd edge: ");
        c = s.nextDouble();

        if(a+b>c && a+c>b && b+c>a)
        {
            p = a+b+c;
        } else {
            System.out.print("Input is invalid!");
            System.exit(2);
        }
        System.out.printf("Perimeter: %.1f\n", p);
    }
}
