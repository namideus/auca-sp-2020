import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String out = "0";
        int n,id;
        int[][] arr;

        while(s.hasNextInt()) {
            n = s.nextInt();

            arr = new int[n][n];

            id = n - 1;
            for (int i = 0; i < n; i++) {
                    arr[i][id] = 3;
                    id--;
                    for (int j = 0; j < n; j++) {
                        if (i == j)
                            arr[i][j] = 2;
                    }
            }
            for(int i=n/3; i<n-n/3; i++)
            {
                for(int j=n/3; j<n-n/3; j++)
                {
                    arr[i][j]=1;
                }
            }
            arr[n/2][n/2]=4;

            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; j++) {
                   System.out.print(arr[i][j]);
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}
