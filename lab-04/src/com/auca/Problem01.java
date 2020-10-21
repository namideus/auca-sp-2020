package com.auca;

public class Problem01 {

    public static void main(String[] args) {
        double sum = 0;
        double d = 0.1;
        for(int i=0;i<10;i++)
            sum+=d;

        if(Math.abs(sum-1)<1e-10)
            System.out.print("Equal");
        else
            System.out.println("Not equal");
    }
}
