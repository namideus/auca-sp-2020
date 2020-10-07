package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * */

public class Problem04 {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    System.out.print("Length in inches? ");
	    double inch = scan.nextDouble();
        System.out.printf("%g in. = %.2f cm.\n", inch, inch*2.54);
    }
}
