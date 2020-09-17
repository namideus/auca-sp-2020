import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total=0;
        for(int i=0;i<2;i++) {
            s.nextInt();
            int num = s.nextInt();
            double price = s.nextDouble();
            total+=num*price;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
