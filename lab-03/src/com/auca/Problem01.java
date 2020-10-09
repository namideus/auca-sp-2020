package com.auca;

import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem01 {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("some real number? ");
	    double v = s.nextDouble();
	    System.out.printf("|%.4f| = %.4f\n", v, (v<0)?-v:v);
    }
}
