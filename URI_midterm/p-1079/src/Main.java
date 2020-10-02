import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a,b,c;
        int n = s.nextInt();
        int max = -1;
        for(int t=0;t<100;t++)
        {
            a = s.nextDouble();
            b = s.nextDouble();
            c = s.nextDouble();
            System.out.printf("%.1f\n", (2*a+3*b+5*c)/10);
        }
    }
}
