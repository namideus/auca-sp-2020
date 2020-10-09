package com.auca;

import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a,b,c, disc,x1,x2;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        disc = b*b - 4*a*c;

        x1 = (-b+Math.sqrt(disc))/2*a;
        x2 = (-b-Math.sqrt(disc))/2*a;

        if (disc>0)
            System.out.printf("The equation has two roots %g and %g\n", x1, x2);

        if (disc==0)
            System.out.printf("The equation has one root %g\n", x1);

        if(disc<0)
            System.out.print("The equation has no real roots\n");
    }
}
