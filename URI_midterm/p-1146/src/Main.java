import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n!=0)
        {
            for(int i=1;i<n;i++)
            {
                System.out.printf("%d ", i);
            }
            System.out.printf("%d\n", n);
            n = sc.nextInt();
        }
    }
}
