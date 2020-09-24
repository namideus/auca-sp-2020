import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i ++)
        {
            int dig = scan.nextInt();
            if(dig >=10 && dig <= 20)
                in++;
            else
                out++;
        }
        System.out.printf("%d in\n%d out\n", in, out);
    }
}
