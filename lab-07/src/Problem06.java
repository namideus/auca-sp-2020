import java.util.Arrays;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int best = -1, d, n = scan.nextInt();
        int[] scores = new int[n];
        System.out.printf("Enter %d scores: ", n);

        for(int i=0;i<n;i++) {
            d = scan.nextInt();
            scores[i] = d;
            best = Math.max(best, d);
        }

        for(int i=0;i<n;i++)
            System.out.printf("Student %d score is %d and grade is %s\n",
                    i, scores[i], getGrade(best, scores[i]));
    }
    private static String getGrade(int best, int grade)
    {
        if(grade>=best-10)
            return "A";
        else if(grade>=best-20)
            return "B";
        else if(grade>=best-30)
            return "C";
        else if(grade>=best-40)
            return "D";
        return "F";
    }
}
