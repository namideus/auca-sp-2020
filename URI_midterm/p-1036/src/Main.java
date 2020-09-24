import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double r1, r2, det;
        if( a!=0 ) {
            det = b * b - 4 * a * c;
            r1 = (-b + Math.sqrt(det))/2*a;
            r2 = (-b - Math.sqrt(det))/2*a;
            System.out.printf("R1 = %.5f\n", r1/100);
            System.out.printf("R2 = %.5f\n", r2/100);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
