import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    private static final double PI = 3.14159;
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        System.out.printf("TRIANGULO = %.3f\n", (a*c)/2.0);
        System.out.printf("CIRCULO = %.3f\n", PI*c*c);
        System.out.printf("TRAPEZIO = %.3f\n", ((a+b)*c)/2.0);
        System.out.printf("QUADRADO = %.3f\n", b*b);
        System.out.printf("QUADRADO = %.3f\n", a*b);
    }
}
