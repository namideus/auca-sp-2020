import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */


public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();
        int amount = scan.nextInt();
        double cost ;

        switch(code)
        {
            case 1:
                cost = 4.00 * amount;
                break;
            case 2:
                cost = 4.50 * amount;
                break;
            case 3:
                cost = 5.00 * amount;
                break;
            case 4:
                cost = 2.00 * amount;
                break;
            default:
                cost = 1.50 * amount;
        }

        System.out.printf("Total: R$ %.2f\n", cost);
    }
}
