import java.util.Random;
import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of tests: ");
        int a, b, c, cor = 0, tests = scan.nextInt();

        Random random=new Random();

        for(int i = 0; i< tests; i++)
        {
            a = (random.nextInt(101)-50);
            b = (random.nextInt(101)-50);
            c = (random.nextInt(101)-50);

            System.out.printf("%d %s = %d\n", a, (b>=0)? "+ "+b : "- "+(-b), c);

            cor+=(a+b==c)?1:0;
        }

        System.out.println("Number of correct answers "+cor);
        System.out.println("Number of incorrect answers "+(tests-cor));
    }
}
