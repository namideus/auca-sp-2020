package com.auca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = sc.nextDouble();
        double cost;

        if(0<weight && weight <= 1)
            cost = 3.5;
        if(1<weight && weight <= 3)
            cost = 5.5;
        if(3<weight && weight <= 10)
            cost = 8.5;
        if(10<weight && weight <= 20)
            cost = 10.5;

    }
}
