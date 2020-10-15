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
        int a,b,t,sum,n = sc.nextInt();

        while(n>0)
        {
            sum=0;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a>b) {
                t = a;
                a = b;
                b = t;
            }
            for(int d=a+1; d<b;d++)
            {
                sum += (d%2>0) ? d : 0;
            }
            System.out.println(sum);
            n--;
        }
    }
}
