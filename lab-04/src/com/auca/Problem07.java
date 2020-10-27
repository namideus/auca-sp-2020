package com.auca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lottery = (int)(Math.random()*999)+100;

        System.out.print("Enter 3-digit number: ");
        int user = sc.nextInt();

        if(lottery==user) {
            System.out.println("You won $10,000!");
        } else if(sortByIncr(lottery)==sortByIncr(user))
        {
            System.out.println("You won $3,000!");
        } else if (oneComDigit(lottery, user))
        {
            System.out.println("You won $1,000!");
        } else {
            System.out.println("You lose!");
        }
    }

    private static int sortByIncr(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0)
        {
            list.add(n%10);
            n/=10;
        }
        Collections.sort(list);
        int r = 0;

        for (Integer integer : list) {
            r*=10;
            r+=integer;
        }
        return r;
    }

    private static boolean oneComDigit(int a, int b)
    {
        String sa = a+"", sb=b+"";

        for(int i=0; i<sa.length(); i++)
        {
            for(int j=0; j<sb.length(); j++)
            {
                if(sa.charAt(i)==sb.charAt(j))
                    return true;
            }
        }
        return false;
    }
}
