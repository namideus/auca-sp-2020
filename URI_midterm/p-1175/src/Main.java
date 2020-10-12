import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        int[] N = new int[20];

        for(int i=0;i<20;i++)
        {
            n = s.nextInt();
            N[i] = n;
        }
        reverse(N);
    }

    public static void reverse(int[] N)
    {
        int id=0;
        for(int i=19; i>=0; i--)
        {
            System.out.printf("N[%d] = %d\n", id, N[i]);
            id++;
        }
    }
}
