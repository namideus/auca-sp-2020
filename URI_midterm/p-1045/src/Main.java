import java.util.Arrays;
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
        double a,b,c;

        double[] arr = new double[3];

        for(int i=0;i<3;i++)
            arr[i] = s.nextDouble();

        Arrays.sort(arr);

        a = arr[2];
        b = arr[1];
        c = arr[0];

        if(a>=b+c) System.out.println("NAO FORMA TRIANGULO");
        else {
            if (a * a == b * b + c * c) System.out.println("TRIANGULO RETANGULO");

            if (a * a > b * b + c * c) System.out.println("TRIANGULO OBTUSANGULO");

            if (a * a < b * b + c * c) System.out.println("TRIANGULO ACUTANGULO");

            if (a == b && b == c) System.out.println("TRIANGULO EQUILATERO");

            if (a == b && b != c || b == c && b != a) System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
