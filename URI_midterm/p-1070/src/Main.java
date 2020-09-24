import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x%2==0) x++;
        for (int i = 0; i < 6; i ++)
        {
            System.out.println(x);
            x+=2;
        }
    }
}
