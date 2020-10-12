import java.util.Arrays;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n,d;
        n = s.nextInt();
        int[] N = new int[n];

        for(int i=0;i<n;i++)
        {
            d = s.nextInt();
            N[i] = d;
        }
        getIntexOfMin(N);
    }

    public static void getIntexOfMin(int[] N)
    {
        int minId=0;
        int min = N[0];

        for(int i=1; i<N.length; i++)
        {
            if (N[i] < min)
            {
                min = N[i];
                minId = i;
            }
        }
        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + minId);
    }
}
