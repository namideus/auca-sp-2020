import java.math.BigInteger;
import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        String As = scan.nextLine();

        System.out.print("B = ");
        String Bs = scan.nextLine();

        BigInteger result, A, B;
        A = new BigInteger(As);
        B = new BigInteger(Bs);
        result = A.gcd(B);

        System.out.printf("GCD(%s, %s) = %s\n", As, Bs,
                (!result.toString().equals("0")) ? result.toString() : "is not defined.");
    }
}
