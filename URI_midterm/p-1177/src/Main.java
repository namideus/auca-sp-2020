import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        long d = 0;
        // int[]x = new int[10];
        for(int i=0; i<1000; i++)
        {
            System.out.printf("N[%d] = %d\n", i, d);
            if(d<t-1)
                d++;
            else
                d= 0;
        }
    }
}
