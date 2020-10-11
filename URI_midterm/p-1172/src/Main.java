import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in;
        // int[]x = new int[10];
        for(int i=0; i<10; i++) {
            in = s.nextInt();
            if(in<=0)
                System.out.printf("X[%d] = %d\n", i, 1);
            else
                System.out.printf("X[%d] = %d\n", i, in);
        }
    }
}
