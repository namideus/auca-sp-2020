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

        int cnt, x=1;
        double points;
        double p;

        while(true) {
            cnt=0;
            points=0;

            if(x==1)
            {
                while (true)
                {
                    p = sc.nextDouble();

                    if (p >= 0 && p <= 10)
                    {
                        cnt++;
                        points += p;
                    } else
                        System.out.print("nota invalida\n");

                    if (cnt == 2)
                        break;
                }
                System.out.printf("media = %.2f\n", points / 2);
            }

            System.out.print("novo calculo (1-sim 2-nao)\n");
            x = sc.nextInt();

            if(x==2)
                break;
        }
    }
}
