import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String msg = "";
        int x,y;
        x = s.nextInt();
        y = s.nextInt();
        while(x!=0 && y!=0)
        {
            if(x>0 && y>0) msg = "primeiro";
            if(x<0 && y>0) msg = "segundo";
            if(x<0 && y<0) msg = "terceiro";
            if(x>0 && y<0) msg = "quarto";
            System.out.println(msg);
            x = s.nextInt();
            y = s.nextInt();
        }
    }
}
