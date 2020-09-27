import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        for(int i=0; i<3;i++) {
            a[i] = s.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(a);
        System.out.printf("%d\n%d\n%d\n", a[0],a[1],a[2]);
        System.out.println();
        System.out.printf("%d\n%d\n%d\n", b[0],b[1],b[2]);
    }

}
