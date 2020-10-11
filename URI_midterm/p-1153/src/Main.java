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
        System.out.println(fact(n));
    }

    // Recursive factorial
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return fact(n-1)*n;
    }
}
