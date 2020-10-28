package com.auca;

import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("month? ");
        int month = s.nextInt();
        if(month==1 || month==2 || month==12)
            System.out.println("winter");
        else if(month>=3 && month<=5)
            System.out.println("spring");
        else if(month>=6 && month<=8)
            System.out.println("summer");
        else if(month>=9 && month<=11)
            System.out.println("autumn");
        else
            System.out.println(month + " is not correct number of month");
    }
}
