import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a,b,c;
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        float result = 0;
        String msg;
        if(a+b>c && a+c>b && b+c>a)
        {
            result = a+b+c;
            msg = "Perimetro = ";
        } else {
            result = (c*a+c*b)/2;
            msg = "Area = ";
        }
        System.out.printf(msg+"%.1f\n", result);
    }

}
