import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int hour = s.nextInt();
        double salaryPerHour = s.nextDouble();
        System.out.printf("NUMBER = %d\n", no);
        System.out.printf("SALARY = U$ %.2f\n", hour*salaryPerHour);
    }
}
