import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1,p2,p3,d1,d2;

        System.out.print("Your coordinate: ");
        p1 = scan.nextInt();
        System.out.print("Coordinate of 1st point: ");
        p2 = scan.nextInt();
        System.out.print("Coordinate of 2nd point: ");
        p3 = scan.nextInt();

        d1 = abs(p1-p2);
        d2 = abs(p1-p3);

        if(d1<d2)
            System.out.println("1st point is closer. Distance "+d1);
        else if(d2<d1)
            System.out.println("2nd point is closer. Distance "+d2);
        else
            System.out.println("Both points are equally close. Distance "+d2);
    }

    public static int abs(int n)
    {
        return (n<0) ? -n : n;
    }
}
