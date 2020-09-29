import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int startHour, endHour, startMin, endMin;

        startHour = s.nextInt();
        startMin = s.nextInt();
        endHour = s.nextInt();
        endMin = s.nextInt();

        startMin += startHour*60;
        endMin += endHour*60;

        if(startMin<endMin)
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (endMin-startMin)/60, (endMin-startMin)%60);

        if(startMin>endMin)
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",
                    (24*60-(startMin-endMin))/60,(24*60-(startMin-endMin))%60);

        if(startMin==endMin)
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24, 0);
    }
}
