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
        int n;

        while(s.hasNextInt())
        {
            n = s.nextInt();
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j && i!=n/2 && j!=n/2)
                        System.out.print("2");
                    /*else if(i==j)
                        System.out.print("3");*/
                    else if (n / 2 == i && n / 2 == j)
                        System.out.print("4");
                    else
                        System.out.print("0");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
