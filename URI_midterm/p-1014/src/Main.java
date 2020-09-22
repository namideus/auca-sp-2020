import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        double y = s.nextDouble();
        System.out.printf("%.3f km/l\n", x/y);
    }
}
