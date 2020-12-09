import java.math.BigInteger;
import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();

        System.out.print("B = ");
        int b = scan.nextInt();

        try {
            System.out.printf("GCD(%d, %d) = %d\n", a, b, gcd(a, b));
        } catch(IllegalArgumentException error)
        {
            System.out.println(error.getMessage());
        }

    }

    public static int gcd(int a, int b)
    {
        if(a==0 && b==0)
            throw new IllegalArgumentException("GCD(0, 0) is not defined");

        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0 || b==0)
            return Math.max(a,b);

        int d = Math.min(a,b);

        while(a % d != 0 || b % d != 0)
        {
            --d;
        }

        return d;
    }

}
