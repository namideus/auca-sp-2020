import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution: ");

        boolean flag = true;
        int k;
        int[][] matrix = new int[9][9];
        int[] sl = new int[9];
        int[] sc = new int[9];
        int[][] sm = new int[3][3];

        for(int i=0;i<9;i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<9;i++) {
            for (int j = 0; j < 9; j++) {
                k = matrix[i][j];
                k*=k;
                sl[i] += k;
                sc[j] += k;
                sm[i/3][j/3] += k;

                if(i==8 && sc[j]!=285) {
                    flag = false;
                    break;
                }
            }
            if(sl[i]!=285) {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            for(int i=0;i<3;i++) {
                for (int j = 0; j < 3; j++) {
                    if (sm[i][j] != 285) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        System.out.println(((flag)?"Valid " : "Invalid ")+"solution");
    }
}
