import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String months[] = new String[]{"January", "February", "March", "April",
                                        "May", "June", "July","August","September",
                                        "October","November","December"};
        int month = scan.nextInt();
        System.out.println(months[month-1]);
    }
}
