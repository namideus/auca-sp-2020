import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        double salary = s.nextDouble();
        double totalProfit = s.nextDouble();
        System.out.printf("TOTAL = R$ %.2f\n", salary+totalProfit*.15);
    }
}
