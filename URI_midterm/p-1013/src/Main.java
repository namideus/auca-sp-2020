import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = (a+b+Math.abs(a-b))/2;
        max = (c+max+Math.abs(c-max))/2;
        System.out.printf("%d eh o maior\n", max);
    }
}
