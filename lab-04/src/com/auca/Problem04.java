package com.auca;

import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("complexity level? ");
        int level = s.nextInt();
        if(4<=level && level<=5)
            System.out.println("You are a pro gamer.");
        else if(2<=level && level<=3)
            System.out.println("You are an experienced gamer.");
        else if(level==1)
            System.out.println("You are a beginner.");
        else if(level==0)
            System.out.println("You are a total newbie.");
    }
}
