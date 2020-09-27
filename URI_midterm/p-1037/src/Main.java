import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n = scan.nextFloat();
        if (n<0 || n>100)
        {
            System.out.println("Fora de intervalo");
        } else
        {
            if(n>25 && n<=50) System.out.println("Intervalo (25,50]");
            if(n>=0 && n<=25) System.out.println("Intervalo [0,25]");
            if(n>75 && n<=100) System.out.println("Intervalo (75,100]");
        }
    }
}





