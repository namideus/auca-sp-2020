import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, t = s.nextInt();
        // int[]x = new int[10];
        for(int i=0; i<t; i++)
        {
            n = s.nextInt();
            System.out.printf("Fib(%d) = %d\n", n, fib(n));
        }
    }

    // Recursive factorial
    public static int fib(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
}
