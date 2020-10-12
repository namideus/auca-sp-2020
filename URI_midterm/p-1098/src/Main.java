import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {

        for(float i=0; i<=2; i+=0.2)
        {
            for(int j=1;j<=3;j++) {
                if ((i % 1)*10 > 0)
                    System.out.printf("I=%.1f J=%.1f\n", i, i + j);
                else
                    System.out.printf("I=%d J=%d\n", (int) i, (int) (j + i));
            }
        }
        System.out.print("I=2 J=3\n");
        System.out.print("I=2 J=4\n");
        System.out.print("I=2 J=5\n");
    }
}
