import java.util.Scanner;

public class Problem09 {

    public static void main(String[] args) {
        System.out.print("i\t\t\t\t\t\tm(i)\n------------------------------\n");

        for(long i=1; i<=901; i+=100)
            System.out.printf("%d\t\t\t\t\t\t%.4f\n", i, m(i));

    }

    // Estimate PI
    private static double m(long i)
    {
        double sum = 0;

        for(int j=1; j<=i; j++)
            sum += Math.pow(-1,j+1)/(2*j-1);

        return sum*4;
    }
}
