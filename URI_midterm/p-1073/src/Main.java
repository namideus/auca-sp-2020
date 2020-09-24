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

        for (int i = 2; i <= n; i +=2)
            System.out.printf("%d^2 = %d\n", i, i*i);
    }
}
