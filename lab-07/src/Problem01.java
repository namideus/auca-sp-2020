import java.util.Random;
import java.util.Scanner;

public class Problem01 {

    private static int cnt[] = new int[13];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();
        Random r = new Random();

        while(n>0)
        {
            cnt[r.nextInt(11)+2]++;
            cnt[r.nextInt(11)+2]++;
            n--;
        }

        for(int i=2;i<=12;i++)
            System.out.println(i+": "+cnt[i]);
    }
}
