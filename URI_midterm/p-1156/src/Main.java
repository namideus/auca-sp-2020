import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        double sum = 0;
        int d=1;
        for(int i=1;i<=39;i+=2)
        {
            sum+=(double)i/d;
            d*=2;
        }
        System.out.printf("%.2f\n", sum);
    }
}
