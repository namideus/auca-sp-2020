import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();

        for(int i=0; i<100; i++)
        {
            System.out.printf("N[%d] = %.4f\n", i, n);
            n/=2;
        }
    }
}
