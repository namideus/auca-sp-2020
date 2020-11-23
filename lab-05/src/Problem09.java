import java.util.Scanner;

public class Problem09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        boolean f = true;
        for(int i=0, j=str.length()-1; i<j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
            {
                f = false;
                break;
            }
        }
        System.out.println(str+" "+((f)?"is a palindrome":"is not a palindrome"));
    }
}
