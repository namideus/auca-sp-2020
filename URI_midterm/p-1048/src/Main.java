import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double salary = s.nextDouble();

        if(salary>=0 && salary<=400) print(salary, 15);
        if(salary>=400.01 && salary<=800) print(salary, 12);
        if(salary>=800.01 && salary<=1200) print(salary, 10);
        if(salary>=1200.01 && salary<=2000) print(salary, 7);
        if(salary>2000) print(salary, 4);
    }

    private static void print(double salary, int percent)
    {
        double increase = (salary*percent)/100.00;
        System.out.printf("Novo salario: %.2f\n", salary+increase);
        System.out.printf("Reajuste ganho: %.2f\n", increase);
        System.out.println("Em percentual: " + percent + " %");
    }
}
