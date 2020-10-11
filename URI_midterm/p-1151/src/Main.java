import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int sum, t1=0, t2=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(t1+((i<n) ? " " : "\n"));
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
