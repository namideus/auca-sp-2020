import com.sun.source.doctree.StartElementTree;

import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        int[] list = new int[10];

        for(int i=0;i<10;i++)
            list[i] = scan.nextInt();

        printArray(eliminateDuplicates(list));
    }

    public static int[] eliminateDuplicates(int[] list)
    {
        boolean f;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j : list) {
            f = true;
            for (Integer integer : arrayList)
                if (j == integer) {
                    f = false;
                    break;
                }
            if (f)
                arrayList.add(j);
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void printArray(int[] list)
    {
        System.out.print("The distinct numbers are: ");
        for (int j : list)
            System.out.print(j + " ");
        System.out.println();
    }
}
