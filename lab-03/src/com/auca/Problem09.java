package com.auca;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem09 {
    private static final String[] srp = {"scissor", "rock", "paper"};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int computerMove = (int)(Math.random()*3), userMove;

        System.out.print("scissor (0), rock(1), paper (2): ");
        userMove = s.nextInt();

        String result = "It is a draw.";

        if(computerMove==0 && userMove==1 || computerMove==2 && userMove==0 || computerMove==1 && userMove==2)
            result = "You won.";

        if(computerMove==1 && userMove==0 || computerMove==0 && userMove==2 || computerMove==2 && userMove==1)
            result = "You lose.";

        System.out.printf("The computer is %s. You are %s. %s\n", srp[computerMove], srp[userMove], result);
    }
}
