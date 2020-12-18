import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int points = scan.nextInt();

        System.out.printf("Enter %d points: ", points);

        double[][] pointsXY = new double[points][2];

        double minDist = Double.MAX_VALUE,x1=0,y1=0,x2=0,y2=0;

        for(int i=0; i<points; i++) {
            pointsXY[i][0] = scan.nextDouble(); // X
            pointsXY[i][1] = scan.nextDouble(); // Y
        }

        for(int i=0; i<points-1; i++) {

            double xn, x = pointsXY[i][0];
            double yn, y = pointsXY[i][1];

            for(int j=i+1; j<points; j++)
            {
                xn = pointsXY[j][0];
                yn = pointsXY[j][1];

                var distance = distance(x,y,xn,yn);

                if(distance<minDist)
                {
                    minDist = distance;

                    x1 = x;
                    y1 = y;

                    x2 = xn;
                    y2 = yn;
                }
            }
        }

        System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n",x1,y1,x2,y2);
    }

    private static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}
