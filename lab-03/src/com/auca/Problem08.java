package com.auca;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Iman
 *
 * */

public class Problem08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = s.nextInt();
        arr[1] = s.nextInt();
        arr[2] = s.nextInt();
        Arrays.sort(arr);
        System.out.printf("%d %d %d\n", arr[0],arr[1],arr[2]);
    }
}
