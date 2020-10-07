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

        int cnt=0;
        double points = 0;
        double p = sc.nextDouble();

        while(true)
        {
            if(p>=0 && p<=10)
            {
                cnt++;
                points+=p;
            } else
                System.out.println("nota invalida");
            if(cnt==2) break;
            p = sc.nextDouble();
        }
        System.out.printf("media = %.2f\n", points/2);
    }
}
