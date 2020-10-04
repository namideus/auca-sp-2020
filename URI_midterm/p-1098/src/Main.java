import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {

        for(double i=0; i<=2; i+=0.2)
        {
            for(int j=1;j<=3;j++) {
                if ((i % 1) > 0)
                    System.out.printf("I=%.1f J=%.1f\n", i, i + j);
                else
                    System.out.printf("I=%d J=%d\n", (int) i, (int) (j + i));
            }
        }
    }
}
