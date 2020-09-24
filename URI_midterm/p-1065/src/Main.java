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

        for(int i=0; i<5; i++)
        {
            double d = scan.nextDouble();
            if (d%2==0)
            {
                even++;
            }
        }
        System.out.printf("%d valores pares\n", even);
    }
}
