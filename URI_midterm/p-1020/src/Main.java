import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int days = s.nextInt();
        int year = days/365;
        days%=365;
        int month = days/30;
        days%=30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", year, month, days);
    }
}
