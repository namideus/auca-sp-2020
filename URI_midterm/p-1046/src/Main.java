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
        int start, end;

        start = s.nextInt();
        end = s.nextInt();

        if(start<end) System.out.printf("O JOGO DUROU %d HORA(S)\n", end-start);

        if(start>end) System.out.printf("O JOGO DUROU %d HORA(S)\n", 24-(start-end));

        if(start==end) System.out.printf("O JOGO DUROU %d HORA(S)\n", 24);
    }
}
