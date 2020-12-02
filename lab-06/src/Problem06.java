import java.util.Scanner;

public class Problem06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = scan.nextLong();

        if (n == 0)
        {
            System.out.println("Number must be greater than zero! Exiting.");
            System.exit(2);
        }

        System.out.println("Sum: "+sumDigits(n));
    }

    public static int sumDigits(long n)
    {
        int sum = 0;

        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }

        return sum;
    }
}
