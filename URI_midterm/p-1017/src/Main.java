import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time = s.nextInt();
        int speed = s.nextInt();
        System.out.printf("%.3f\n", (time*speed)/12.0);
    }
}
