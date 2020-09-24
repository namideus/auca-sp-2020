import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();

        if( B>C && D>A && C+D > A+B && C>0 && D>0 && A%2==0) {
            System.out.print("Valores aceitos\n");
        } else {
            System.out.print("Valores nao aceitos\n");
        }
    }
}
