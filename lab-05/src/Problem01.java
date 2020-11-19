import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, cnt = 0;
        double sum = 0;

        while(true)
        {
            n = scanner.nextInt();

            if(n==0) break;

            sum+=n;
            ++cnt;
        }

        if(cnt==0)
            System.out.println("Nothing to calculate");
        else
            System.out.printf("The arithmetic mean is %.1f\n", sum/cnt);
    }
}
