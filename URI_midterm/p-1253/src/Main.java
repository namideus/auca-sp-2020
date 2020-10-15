import java.util.Scanner;

/**
 * @author Yiman
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int shift, t = s.nextInt();
        String str;

        for(int i=1; i<=t; i++)
        {
            str=s.next();
            shift=s.nextInt();

            for(char ch: str.toCharArray())
                System.out.print((char)(ch-shift));

            System.out.println();
        }
    }
}
