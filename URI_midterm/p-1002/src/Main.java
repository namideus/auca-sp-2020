import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // PI
    private static final double PI =  3.14159;
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble(); // Radius
        double A = PI*r*r; // Area of circle
        System.out.printf("A=%.4f\n", A); // Print result
    }
}
