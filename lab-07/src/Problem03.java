import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.printf("Enter %d element: ",i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Before reversing: ");
        printArray(array);

        System.out.println("After reversing: ");
        printArray(reverseArray(array));
    }

    public static int[] reverseArray(int[] a)
    {
        int [] reversed = new int[a.length];
        for(int i=0,j=a.length-1; j>=0; j--, i++)
            reversed[i] = a[j];
        return reversed;
    }

    public static void printArray(int[] a)
    {
        for (int j : a)
            System.out.print(j + " ");
        System.out.println();
    }
}
