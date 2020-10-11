import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        // int[]x = new int[10];
        for(int i=0; i<10; i++)
        {
            System.out.printf("X[%d] = %d\n", i, n);
            n*=2;
        }
    }
}
