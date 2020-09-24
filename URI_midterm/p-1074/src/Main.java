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

        for (int i = 0; i < n; i ++)
        {
            int dig = scan.nextInt();

            if(dig==0)
            {
                System.out.print("NULL\n");
                continue;
            }

            if(dig%2==0)
                System.out.print("EVEN ");
            else
                System.out.print("ODD ");

            if(dig>0)
                System.out.print("POSITIVE\n");
            else
                System.out.print("NEGATIVE\n");
        }
    }
}
