import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scan.nextLong();

        System.out.printf("Reverse of %d is %d\n", number, reverse(number));
        System.out.println(is_palindrome(number)? "Palindrome!" : "Not palindrome!" );
    }

    public static long reverse(long number)
    {
        long reversed = 0;

        while(number>0)
        {
            reversed = reversed*10 + number%10;
            number/=10;
        }

        return reversed;
    }

    public static boolean is_palindrome(long number)
    {
        return number == reverse(number);
    }

}
