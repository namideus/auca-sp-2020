package com.auca;

import java.util.Scanner;

/**
 * @author Yiman
 *
 * Summation of series.
 *
 * */

public class Main
{
    // Main
    public static void main(String[] args)
    {
        // Using for ... loop
        int sum = 0;
        for(int i = 1; i<=9; i++) // for loop
        {
            sum+=i; // summation
        }
        System.out.print(sum); // print result

        // Using Gauss' formula
//        int n = 9; // n
//        System.out.print((n*(n+1))/2); // print result
    }
}