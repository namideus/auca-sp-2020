import java.util.Scanner;

public class Problem07 {
    private static int[] count = new int[101];
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");

        while(true)
        {
            num = scan.nextInt();
            if(num==0) break;
            count[num]++;
        }

        for(int i=2; i<100; i++)
            if(count[i]>0)
                System.out.printf("%d occurs %d %s\n",
                        i,count[i],(count[i]==1)?"time":"times");
    }
}
