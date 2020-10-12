import java.util.Arrays;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int n;

        for(int i=0; i<t; i++)
        {
            n = s.nextInt();
            if(isPrime(n))
                System.out.printf("%d eh primo\n", n);
            else
                System.out.printf("%d nao eh primo\n", n);
        }
    }

    public static boolean isPrime(int n)
    {
        for(int i=2; i<n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
