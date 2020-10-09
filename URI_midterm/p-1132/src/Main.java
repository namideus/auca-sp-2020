import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        int sum = 0;

        for (int i = Math.min(x, y); i <= Math.max(x, y); i++)
            sum+=(i%13>0) ? i : 0;

        System.out.println(sum);
    }
}
