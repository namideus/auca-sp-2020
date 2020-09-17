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
        int R = s.nextInt();
        double V = (4/3.0)*PI*R*R*R;
        System.out.printf("VOLUME = %.3f\n", V);
    }
}
