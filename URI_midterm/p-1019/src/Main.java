import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int seconds = s.nextInt();
        int hour = seconds/3600;
        seconds%=3600;
        int min = seconds/60;
        seconds%=60;
        System.out.printf("%d:%d:%d\n", hour, min, seconds);
    }
}
