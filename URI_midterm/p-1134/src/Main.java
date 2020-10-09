import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inter = 0, x, alc = 0, gas = 0, dies = 0;

        while (true)
        {
            x = sc.nextInt();

            if(x==1) alc++;

            if(x==2) gas++;

            if(x==3) dies++;

            if(x==4) break;
        }
        System.out.print("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n", alc);
        System.out.printf("Gasolina: %d\n", gas);
        System.out.printf("Diesel: %d\n", dies);
    }
}
