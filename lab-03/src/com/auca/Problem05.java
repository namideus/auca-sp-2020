package com.auca;

import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number of points? ");
        int grade = s.nextInt();
        if(grade>=90 && grade<=100)
            System.out.println("Grade: A");
        else if(grade>=80 && grade<90)
            System.out.println("Grade: B");
        else if(grade>=70 && grade<80)
            System.out.println("Grade: C");
        else if(grade>=60 && grade<70)
            System.out.println("Grade: D");
        else
            System.out.printf("%d is not in the permitted range.\n", grade);
    }
}
