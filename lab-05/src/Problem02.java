import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Integer? ");

        int sum=0, n = scanner.nextInt();

        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }

        System.out.println("The sum of all digits "+sum);
    }
}
