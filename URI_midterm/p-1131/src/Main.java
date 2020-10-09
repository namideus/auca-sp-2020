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

        int inter = 0, cnt = 0, score1, score2, gremio = 0, draw = 0, x = 1;

        while (true)
        {
            if(x==1)
            {
                cnt++;
                score1 = sc.nextInt();
                score2 = sc.nextInt();

                if (score1 > score2)
                    inter++;
                else if (score1 < score2)
                    gremio++;
                else
                    draw++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            x = sc.nextInt();

            if(x==2)
                break;
        }
        System.out.printf("%d grenais\n", cnt);
        System.out.printf("Inter:%d\n", inter);
        System.out.printf("Gremio:%d\n", gremio);
        System.out.printf("Empates:%d\n", draw);
        if( inter>gremio )
            System.out.print("Inter venceu mais\n");
        else if(inter<gremio)
            System.out.print("Gremio venceu mais\n");
        else
            System.out.print("Não houve vencedor\n");
    }
}
