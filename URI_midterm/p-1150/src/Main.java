import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, z, cnt=1,sum;
        x = sc.nextInt();
        z = sc.nextInt();

        sum = x;

        while(z<x)
        {
            z = sc.nextInt();
        }
        while(sum<z)
        {
            sum+=++x;
            cnt++;
        }
        System.out.println(cnt);
    }
}
