import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = 0;
        double sum = 0;
        for(int i=0; i<6; i++)
        {
            double d = scan.nextDouble();
            if (d>0)
            {
                sum+=d;
                ++c;
            }
        }
        System.out.printf("%d valores positivos\n", c);
        System.out.printf("%.1f\n", sum/c);
    }
}
