import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double MEDIA = (A*3.5 + B*7.5)/2;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
