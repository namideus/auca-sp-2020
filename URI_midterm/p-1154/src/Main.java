import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0, age;
        int cnt = 0;
        while(true)
        {
            age = sc.nextDouble();
            if(age<0) break;
            sum+=age;
            cnt++;
        }
        System.out.printf("%.2f\n", sum/cnt);
    }
}
