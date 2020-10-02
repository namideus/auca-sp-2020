import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isento = false;
        double salary = scan.nextDouble();
        double result = 0;

        if(salary>=0 && salary<=2000) {
            System.out.println("Isento");
            isento = true;
        }

        if(salary>2000 && salary<=3000)
        {
            salary -= 2000;
            result += (salary*8)/100.00;
        }

        if(salary>3000 && salary<=4500)
        {
            salary -= 3000;
            result += (1000*8)/100.00;
            result += (salary*18)/100.00;
        }

        if(salary>4500) // 4520.00
        {
            salary -= 4000; // 452.00
            result += (1000*8)/100.00;
            result += (1000*18)/100.00;
            result += (salary*28)/100.00 - 50.00;
        }

        if(!isento) System.out.printf("R$ %.2f\n", result);
    }
}
