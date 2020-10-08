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
                p = sc.nextDouble();
                while (true) {
                    if (p >= 0 && p <= 10) {
                        cnt++;
                        points += p;
                    } else
                        System.out.println("nota invalida");
                    if (cnt == 2) break;
                    p = sc.nextDouble();
                }
                System.out.printf("media = %.2f\n", points / 2);
            } else if(x==2) {
                break;
            } else {
                System.out.println("novo calculo (1-sim 2-nao)");
            }
            x = sc.nextInt();
        }
    }
}
