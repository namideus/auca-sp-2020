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

        System.out.print("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", (int)(n/100.00));
        n%=100.00;
        System.out.printf("%d nota(s) de R$ 50.00\n", (int)(n/50.00));
        n%=50.00;
        System.out.printf("%d nota(s) de R$ 20.00\n", (int)(n/20.00));
        n%=20.00;
        System.out.printf("%d nota(s) de R$ 10.00\n", (int)(n/10.00));
        n%=10.00;
        System.out.printf("%d nota(s) de R$ 5.00\n", (int)(n/5.00));
        n%=5.00;
        System.out.printf("%d nota(s) de R$ 2.00\n", (int)(n/2.00));
        n%=2.00;

        System.out.print("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", (int)(n/1.00));
        n%=1.00;
        System.out.printf("%d moeda(s) de R$ 0.50\n", (int)(n/0.50));
        n%=0.50;
        System.out.printf("%d moeda(s) de R$ 0.25\n", (int)(n/0.25));
        n%=0.25;
        System.out.printf("%d moeda(s) de R$ 0.10\n", (int)(n/0.10));
        n%=0.10;
        System.out.printf("%d moeda(s) de R$ 0.05\n", (int)(n/0.05));
        n%=0.05;
        System.out.printf("%d moeda(s) de R$ 0.01\n", (int)(n/0.01));
    }
}
