package com.auca;

import java.util.Scanner;

public class Problem10 {

    private static final String [] ranks  = new String[]{"Ace","2","3","4","5","6","7","8",
            "9","10","Jack","Queen","King"};

    private static final String [] suits  = new String[]{"Clubs","Diamonds","Hearts","Spades"};

    public static void main(String[] args) {

        int rankId = (int)(Math.random()*12);
        int suitId = (int)(Math.random()*3);

        System.out.print("Rank:\n" +
                "0) Ace\n" +
                "1) 2\n" +
                "2) 3\n" +
                "3) 4\n" +
                "4) 5\n" +
                "5) 6\n" +
                "6) 7\n" +
                "7) 8\n" +
                "8) 9\n" +
                "9) 10\n" +
                "10) Jack\n" +
                "11) Queen\n" +
                "12) King\n\n" +
                "Suit:\n" +
                "0) Clubs\n" +
                "1) Diamonds\n" +
                "2) Hearts\n" +
                "3) Spades\n");

        System.out.printf("The card you picked is %s of %s\n", ranks[rankId], suits[suitId]);
    }
}
