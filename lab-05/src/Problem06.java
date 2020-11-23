import java.util.Scanner;

public class Problem06 {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n, sum=0;

	    while(true)
        {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            n = scan.nextInt();
            if(n==0) break;
            sum+=n;
        }

	    System.out.println("The sum is " + sum);
    }
}
