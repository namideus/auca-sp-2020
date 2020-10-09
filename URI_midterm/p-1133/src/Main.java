import javax.sound.midi.SysexMessage;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        for(int i=Math.min(x,y)+1; i<Math.max(x,y); i++)
            if(i%5==2 || i%5==3)
                System.out.println(i);
    }
}
