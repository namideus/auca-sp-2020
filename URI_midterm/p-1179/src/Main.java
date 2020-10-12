import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int evenId = 0;
        int oddId = 0;
        for(int t=0; t<15; t++)
        {
            n = s.nextInt();
            if(n%2==0)
            {
                System.out.printf("par[%d] = %d\n", evenId, n);
                if(evenId<4)
                    evenId++;
                else
                    evenId = 0;
            } else
            {
                System.out.printf("impar[%d] = %d\n", oddId, n);
                if(oddId<4)
                    oddId++;
                else
                    oddId = 0;
            }
        }
    }
}
