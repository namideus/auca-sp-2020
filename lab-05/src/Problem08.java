public class Problem08 {

    public static void main(String[] args) {
        System.out.print("\t\t\tMultiplication Table\n\t\t");

        for(int i=1; i<=9; i++)
            System.out.print(i+"\t");

        System.out.println("\n------------------------------------------");

        for(int i=1; i<=9; i++)
        {
            System.out.print(i+"\t|\t");
            for(int j=1; j<=9; j++)
                System.out.print(i*j+"\t");
            System.out.println();
        }
    }
}
