import java.util.Random;
import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of tests: ");
        int a, b, c, cor = 0, incor = 0, tests = scan.nextInt();

        while(tests>0)
        {
            Random random=new Random();

            a = (random.nextInt(200)-100);
            b = (random.nextInt(200)-100);
            c = (random.nextInt(200)-100);

            System.out.printf("%d + %d = %d\n", a, b, c);

            if(a+b==c)
                cor++;
            else
                incor++;

            tests--;
        }

        System.out.println("Number of correct answers "+cor);
        System.out.println("Number of correct answers "+incor);
    }
}
