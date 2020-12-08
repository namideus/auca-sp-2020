import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        double[] array = new double[10];

        for(int i=0;i<10;i++)
            array[i] = scan.nextDouble();

        System.out.printf("Index of smallest element: %d\n", indexOfSmallestElement(array));
    }

    public static int indexOfSmallestElement(double[] array)
    {
        int index = 0;
        double min = array[0];

        for(int i=1; i<array.length;i++)
            if(array[i]<min)
            {
                min = array[i];
                index = i;
            }

        return index;
    }
}
