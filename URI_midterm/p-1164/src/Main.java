import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, t = s.nextInt();

        for(int i=0;i<t;i++)
        {
            n = s.nextInt();
            if(isPerfect(n))
                System.out.printf("%d eh perfeito\n", n);
            else
                System.out.printf("%d nao eh perfeito\n", n);
        }

    }

    public static boolean isPerfect(int n)
    {
        int sum = 0;
        for(int d=1;d<n;d++)
        {
            if(n%d==0)
            {
                sum+=d;
                if(sum==n)
                    return true;
            }
        }
        return false;
    }
}
