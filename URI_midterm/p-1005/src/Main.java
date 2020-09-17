import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Scanner
        float a = s.nextFloat(); // A grade
        float b = s.nextFloat(); // B grade
        System.out.printf("MEDIA = %.5f\n", ((a*3.5) + (b*7.5))/11 ); // Print average grade
    }
}
