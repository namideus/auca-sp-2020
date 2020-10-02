import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i=1;
        for(int t=60;t>=0;t-=5)
        {
            System.out.printf("I=%d J=%d\n", i, t);
            i+=3;
        }
    }
}
