import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int x,y, sum;
        for(int i=0;i<n;i++)
        {
            x = s.nextInt();
            y = s.nextInt();
            sum = 0;
            for(int t=0;t<y;t++)
            {
                if(x%2==0) ++x;
                sum+=x;
                x+=2;
            }
            System.out.printf("%d\n", sum);
        }
    }
}
