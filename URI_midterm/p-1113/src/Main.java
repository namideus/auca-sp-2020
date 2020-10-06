import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m,n,sum;
        m = sc.nextInt();
        n = sc.nextInt();

        while(m!=n)
        {
            if(m<n) System.out.println("Crescente");

            if(m>n) System.out.println("Decrescente");

            m = sc.nextInt();
            n = sc.nextInt();
        }
    }
}
