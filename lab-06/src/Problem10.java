public class Problem10 {

    public static void main(String[] args)
    {
        System.out.print("i\t\t\t\t\t\tm(i)\n------------------------------\n");

        for(long i=1; i<=20; i++)
            System.out.printf("%d\t\t\t\t\t\t%.4f\n", i, m(i));

    }

    // Sum series
    private static double m(long i)
    {
        double sum = 0;

        for(float j=1; j<=i; j++)
            sum += j/(j+1);

        return sum;
    }
}
