import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int neg = 0;
        int pos = 0;

        for(int i=0; i<5; i++)
        {
            double d = scan.nextDouble();
            if (d%2==0)
                even++;
            else
                odd++;

            if(d>0)
                pos++;

            if(d<0)
                neg++;
        }
        System.out.printf("%d valor(es) par(es)\n", even);
        System.out.printf("%d valor(es) impar(es)\n", odd);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);
    }
}
