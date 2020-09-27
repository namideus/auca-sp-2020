import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float N1 = s.nextFloat();
        float N2 = s.nextFloat();
        float N3 = s.nextFloat();
        float N4 = s.nextFloat();
        float N5 = 0;

        float average = (N1*2 + N2*3 + N3*4 + N4*1)/10;

        if(average>=5.0 && average<=6.9)
        {
            N5 = s.nextFloat();
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
