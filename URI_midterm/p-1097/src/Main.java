import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = 0;
        for(int i=1;i<=9;i+=2)
        {
            for(int j=7+d;j>=5+d;j--)
                System.out.printf("I=%d J=%d\n", i, j);
            d+=2;
        }
    }
}
