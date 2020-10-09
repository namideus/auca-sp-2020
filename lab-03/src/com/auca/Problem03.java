package com.auca;

import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1st number? "); int a = s.nextInt();
        System.out.print("2nd number? "); int b = s.nextInt();
        System.out.print("3rd number? "); int c = s.nextInt();
        System.out.printf("The value %d is the greatest one.\n", Math.max(a, Math.max(b,c)));
    }
}
