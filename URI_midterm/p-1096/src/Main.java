import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(int i=1;i<=9;i++)
        {
            for(int j=7;j>=5;j--)
                System.out.printf("I=%d J=%d\n", i, j);
        }
    }
}
