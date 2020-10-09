import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = 1;

        for(int i=0;i<n;i++)
        {
            System.out.printf("%d %d %d\n", d, d*d, d*d*d);
            d++;
        }
    }
}
