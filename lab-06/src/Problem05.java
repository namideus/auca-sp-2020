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

    public static int GCD(int A, int B)
    {
        int R; // Remainder

        while(A != 0) // While greater than 0
        {
            R = B % A; // B mod A
            B = A; // B = A
            A = R; // A = remainder
        }

        return B;
    }
}
