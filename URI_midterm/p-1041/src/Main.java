import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float x = s.nextFloat();
        float y = s.nextFloat();
        String msg = "";
        if(x==0 && y==0) msg = "Origem";
        if(x>0 || x<0 && y==0) msg = "Eixo X";
        if(y>0 || y<0 && x==0) msg = "Eixo Y";
        if(x>0 && y>0) msg = "Q1";
        if(x<0 && y>0) msg = "Q2";
        if(x<0 && y<0) msg = "Q3";
        if(x>0 && y<0) msg = "Q4";
        System.out.println(msg);
    }
}
