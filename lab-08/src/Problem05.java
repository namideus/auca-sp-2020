import java.util.Scanner;

public class Problem05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.print("Enter matrix1: ");
        for(int i=0; i<3;i++)
            for(int j=0;j<3;j++)
                matrix1[i][j] = scan.nextDouble();

        System.out.print("Enter matrix2: ");
        for(int i=0; i<3;i++) {
            for (int j = 0; j < 3; j++)
                matrix2[i][j] = scan.nextDouble();
        }

        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        System.out.println("The multiplication of the matrices is");
        System.out.printf("%.1f %.1f %.1f     %.1f %.1f %.1f     %.1f %.1f %.1f\n",
                matrix1[0][0],matrix1[0][1],matrix1[0][2],
                matrix2[0][0],matrix2[0][1],matrix2[0][2],
                matrix3[0][0],matrix3[0][1],matrix3[0][2]);
        System.out.printf("%.1f %.1f %.1f  *  %.1f %.1f %.1f  =  %.1f %.1f %.1f\n",
                matrix1[1][0],matrix1[1][1],matrix1[1][2],
                matrix2[1][0],matrix2[1][1],matrix2[1][2],
                matrix3[1][0],matrix3[1][1],matrix3[1][2]);
        System.out.printf("%.1f %.1f %.1f     %.1f %.1f %.1f     %.1f %.1f %.1f\n",
                matrix1[2][0],matrix1[2][1],matrix1[2][2],
                matrix2[2][0],matrix2[2][1],matrix2[2][2],
                matrix3[2][0],matrix3[2][1],matrix3[2][2]);
    }

    public static double[][] multiplyMatrix(double[][] a, double[][]b)
    {
        double[][]c = new double[3][3];

        for(int i=0; i<3;i++)
            for(int j=0;j<3;j++)
                c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j];
        return c;
    }
}
