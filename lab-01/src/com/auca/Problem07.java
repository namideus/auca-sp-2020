package com.auca;

/**
 * @author Yiman
 *
 * Display a table.
 *
 * */

public class Problem07 {

    // Main
    public static void main(String[] args)
    {
        System.out.println("a\t\ta^2\t\ta^3");
        for(int a = 1; a<=4; a++) // for ... loop
        {
            System.out.println(a+"\t\t"+(a*a)+"\t\t"+(a*a*a));
        }
    }

}

