import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double N1 = s.nextDouble();
        double N2 = s.nextDouble();
        double N3 = s.nextDouble();
        double N4 = s.nextDouble();
        double N5 = 0;

        double average = (N1*2 + N2*3 + N3*4 + N4*1)/10.0;

        if(average>=5.0 && average<=6.9)
        {
            N5 = s.nextDouble();
        }

        System.out.printf("Media: %.1f\n", average);
        if(average>=7.0) System.out.println("Aluno aprovado.");
        if(average<5.0) System.out.println("Aluno reprovado.");
        if(average>=5.0 && average<=6.9)
        {
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", N5);
            average+=N5;
            average/=2;
            System.out.println("Aluno aprovado.");
            System.out.printf("Media final: %.1f\n", average);
        }

    }
}
