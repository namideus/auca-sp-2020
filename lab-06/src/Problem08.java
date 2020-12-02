import java.util.Scanner;

public class Problem08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int k=0; k<n-i;k++)
                System.out.print("  ");

            for(int j=i; j>=1; j--)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}
