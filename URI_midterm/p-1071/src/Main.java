import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, sum=0;
        x = sc.nextInt();
        y = sc.nextInt();

        if(x<0) x=-x;
        if(y<0) y=-y;

        for(int i=Math.min(x,y)+1; i<Math.max(x,y); i++)
            if(i%2>0)
                sum+=i;

        System.out.println(sum);
    }
}
