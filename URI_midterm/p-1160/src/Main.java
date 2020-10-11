import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, sum;
        while(true)
        {
            x = s.nextInt();
            if(x==0)
                break;
            sum = 0;
            for(int t=0;t<5;t++)
            {
                if(x%2>0) x++;
                if(x%2==0) sum+=x;
                x+=2;
            }
            System.out.printf("%d\n", sum);
        }
    }
}
