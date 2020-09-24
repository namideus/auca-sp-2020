import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = 0;
        for(int i=0; i<6; i++)
        {
            double d = scan.nextDouble();
            if (d>0) ++c;
        }
        System.out.println(c+" valores positivos");
    }
}
