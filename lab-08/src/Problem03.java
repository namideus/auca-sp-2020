import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int points = scan.nextInt();

        System.out.printf("Enter %d points: ", points);

        double[] xs = new double[points];
        double[] ys = new double[points];

        double minDist = Double.MAX_VALUE,x1=0,y1=0,x2=0,y2=0;

        for(int i=0; i<points; i++) {
            xs[i] = scan.nextDouble();
            ys[i] = scan.nextDouble();
        }

        for(int i=0; i<points-1; i++) {

            double x = xs[i];
            double y = ys[i];

            for(int j=i+1; j<points; j++)
            {
                var distance = Math.sqrt((x-xs[j])*(x-xs[j])+(y-ys[j])*(y-ys[j]));

                if(distance<minDist)
                {
                    minDist = distance;

                    x1 = x;
                    y1 = y;

                    x2 = xs[j];
                    y2 = ys[j];
                }
            }
        }

        System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n",x1,y1,x2,y2);
    }
}
