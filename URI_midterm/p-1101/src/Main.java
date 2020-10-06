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

        int m,n,sum;
        m = sc.nextInt();
        n = sc.nextInt();

        while(m>0 && n>0)
        {
            sum = 0;
            for(int i=Math.min(n,m);i<=Math.max(n,m);i++) {
                System.out.printf("%d ", i);
                sum+=i;
            }
            System.out.printf("Sum=%d\n", sum);

            m = sc.nextInt();
            n = sc.nextInt();
        }
    }
}
