import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double a = s.nextFloat();
        double b = s.nextFloat();
        double c = s.nextFloat();
        double x1, x2, delta;
        delta = (b * b) - (4 * a * c);

        if( a==0 || delta<0) {
            System.out.println("Impossivel calcular");
        } else {
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
    }
}
