package com.auca;

import java.util.Scanner;

public class Problem08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = sc.nextDouble();
        double cost = 0;

        if(weight>50)
        {
            System.out.println("The package cannot be shipped.");
            System.exit(2);
        }

        if(weight<0)
        {
            System.out.println("Invalid weight.");
            System.exit(2);
        }

        if(0<weight && weight <= 1)
            cost = 3.5;
        else if(weight <= 3)
            cost = 5.5;
        else if(weight <= 10)
            cost = 8.5;
        else if(weight <= 20)
            cost = 10.5;
        else if(weight<=33)
            cost = 13.5;
        else if(weight<=50)
            cost = 15.5;

        System.out.printf("Cost of shipping: $%.1f\n", cost);
    }
}
