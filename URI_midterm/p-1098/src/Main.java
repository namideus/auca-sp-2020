import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(double i=0; i<=2; i+=0.2)
        {
            for(int j=1;j<=3;j++)
               if(i%1>0.0)
                   System.out.printf("I=%.1f J=%.1f\n", i, j+i);
               else
                   System.out.printf("I=%d J=%d\n", (int)i, (int)(j+i));
        }
    }
}
