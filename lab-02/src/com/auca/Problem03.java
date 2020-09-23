package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * */

public class Problem03 {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    System.out.print("A four-digit integer? ");
	    int digit = scan.nextInt();
	    int sum = 0;

	    for (int i = 1000; i>0; i/=10)
        {
            sum += digit/i;
            digit %= i;
        }
	    
        System.out.printf("The sum of all digits is %d\n", sum);
    }
}
