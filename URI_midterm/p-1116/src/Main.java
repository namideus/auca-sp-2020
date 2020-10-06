import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        double x, y,r=0;

        t = sc.nextInt();

        while(t>0)
        {
            x = sc.nextDouble();
            y = sc.nextDouble();
            if (y==0)
                System.out.println("divisao impossivel");
            else
                System.out.printf("%.1f\n", x/y);
            t--;
        }
    }
}
