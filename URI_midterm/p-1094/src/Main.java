import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String animal;
        int n, amount,
                coelhos=0,
                ratos=0,
                sapos=0;
        double total;
        n = s.nextInt();

        for(int t=1;t<=n;t++)
        {
            amount = s.nextInt();
            animal = s.nextLine();
            animal = animal.trim();

            if(animal.equals("C")) coelhos+=amount;

            if(animal.equals("R")) ratos+=amount;

            if(animal.equals("S")) sapos+=amount;
        }
        total = coelhos + ratos + sapos;
        System.out.printf("Total: %d cobaias\n", (int)total);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (coelhos/total)*100.00);
        System.out.printf("Percentual de ratos: %.2f %%\n", (ratos/total)*100.00);
        System.out.printf("Percentual de sapos: %.2f %%\n", (sapos/total)*100.00);
    }
}
