import java.math.BigInteger;
import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        String A = scan.nextLine();

        System.out.print("B = ");
        String B = scan.nextLine();

        String result = GCD(A,B);

        System.out.printf("GCD(%s, %s) = %s\n", A, B,
                (!result.equals("0")) ? result : "is not defined.");
    }

    public static String GCD(String As, String Bs)
    {
        BigInteger result, A, B;
        A = new BigInteger(As);
        B = new BigInteger(Bs);
        result = A.gcd(B);
        return result.toString();
    }
}
