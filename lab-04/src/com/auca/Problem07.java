package com.auca;

import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lottery = (int)(Math.random()*1000)+100;

        System.out.print("Enter 3-digit number: ");
        int user = sc.nextInt();

        if(lottery==user)
            System.out.println("You won $10,000!");
        else {

        }
    }
}
