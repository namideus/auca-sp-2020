import java.util.ArrayList;
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n, below=0, above=0;
        double sum = 0, average;
        System.out.println("Enter scores (negative to stop): ");
        while(true)
        {
            n = scanner.nextInt();
            if(n<0)
                break;
            sum += n;
            arrayList.add(n);
        }
        average = sum/arrayList.size();
        for(int score: arrayList)
        {
            if(score>=average)
                ++above;
        }
        System.out.printf("Scores >= average: %d\nScores < average: %d\n",
                above, arrayList.size()-below);
    }
}
