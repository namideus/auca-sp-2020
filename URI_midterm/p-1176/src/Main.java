import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n, t = s.nextLong();
        // int[]x = new int[10];
        for(int i=0; i<t; i++)
        {
            n = s.nextLong();
            System.out.printf("Fib(%d) = %d\n", n, fib(n));
        }
    }

    // Recursive factorial
    public static long fib(long n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}
