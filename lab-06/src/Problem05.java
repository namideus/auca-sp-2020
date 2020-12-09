import java.util.Scanner;

public class Problem05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int A = scan.nextInt();

        System.out.print("B = ");
        int B = scan.nextInt();

        System.out.printf("GCD(%d, %d) = %s\n", A,B, (GCD(A,B)>0) ? GCD(A,B)+"" : "is not defined.");
    }

    public static int GCD(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);

        int r;

        while(a != 0)
        {
            r = b % a;
            b = a;
            a = r;
        }

        return b;
    }
}
