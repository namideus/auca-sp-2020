import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, pos = 1, max = -1;
        for(int t=1;t<=100;t++)
        {
            n = s.nextInt();
            if(n>max)
            {
                max = n;
                pos = t;
            }
        }
        System.out.printf("%d\n%d\n", max, pos);
    }
}
