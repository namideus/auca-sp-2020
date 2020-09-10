package com.auca;

/**
 * @author Yiman
 *
 * Approximate the number PI.
 *
 * */

public class Problem09 {

    // Main
    public static void main(String[] args)
    {
        System.out.println("PI = " + PI(6)); // n = 6
        System.out.println("PI = " + PI(7)); // N = 7
    }

    // Approximates the constant PI for arbitrary N value
    public static double PI(int n) {

        double sum = 0;
        int denom = 1;

        for (int i=1; i<=n; i++)
        {
            sum += Math.pow(-1,(i+1))*(1.0/denom);
            denom += 2;
        }
        return 4*sum;
    }

}

