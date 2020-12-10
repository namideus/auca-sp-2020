import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 rows and 4 columns: ");

        int[][] arr = new int[3][4];

        for(int i=0; i<3;i++)
            for(int j=0;j<4;j++)
                arr[i][j] = scan.nextInt();

        System.out.println("Sum of all elements: "+getSum(arr));
    }

    public static int getSum(int[][] arr)
    {
        int sum = 0;
        for(int i=0; i<3;i++)
            for(int j=0;j<4;j++)
                sum+=arr[i][j];

        return sum;
    }
}
