import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {

        int correctCount;

        char[][] answers = {
                {'A','B','C','D','E','B','B','D','D','C'},
                {'B','C','C','D','A','B','D','D','A','A'},
                {'A','D','A','A','E','B','B','D','D','C'},
                {'C','B','C','A','A','B','D','E','E','D'},
                {'D','B','C','D','E','B','B','D','D','C'},
                {'A','A','A','A','E','B','A','A','C','A'},
                {'C','C','D','A','B','A','A','A','C','D'},
                {'A','B','B','B','B','B','B','D','D','C'}
        };

        char[] keys = {'A','A','C','D','E','A','B','E','B','C'};
        int[] correctAnswers = new int[answers.length];

        for(int i=0; i<answers.length; i++)
        {
            correctCount = 0;
            for(int j=0; j<answers[i].length; j++)
            {
                if (answers[i][j]==keys[j])
                    correctCount++;
            }
            correctAnswers[i] = correctCount;
        }

        for(int i=0; i<correctAnswers.length; i++)
            System.out.printf("Student %d's correct count is %d\n", i,correctAnswers[i]);
    }
}
