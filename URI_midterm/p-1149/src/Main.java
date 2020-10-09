import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int a = sc.nextInt();
        int n = sc.nextInt();

        while(n==0 || n<0)
        {
            n = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            sum+=a;
            a++;
        }

        System.out.println(sum);
    }
}
