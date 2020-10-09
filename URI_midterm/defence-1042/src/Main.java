import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int[] arr = new int[] {a,b,c};
        Arrays.sort(arr);
        System.out.printf("%d\n%d\n%d\n", arr[0],arr[1],arr[2]);
        System.out.println();
        System.out.printf("%d\n%d\n%d\n", a,b,c);
    }
}
