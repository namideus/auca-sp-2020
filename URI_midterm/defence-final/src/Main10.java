public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(j>i)
                    arr[i][j] = 1;
            }
        }

        for(int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
