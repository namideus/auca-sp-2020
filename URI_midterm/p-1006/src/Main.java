import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        System.out.printf("MEDIA = %.1f\n", (a*2 + b*3 + c*5)/10 );
    }
}
