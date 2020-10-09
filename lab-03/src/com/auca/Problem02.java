package com.auca;

import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number of points? ");
        int p = s.nextInt();

        if(p>=40)
        {
            System.out.printf("You passed \"Structured Programming\"!" +
                    "\nYou should take \"Object-Oriented Programming\" in the next semester.");
        } else {
            System.out.printf("You failed \"Structured Programming\"!" +
                    "\nYou can take it again in the fall semester next year.");
        }
    }
}
