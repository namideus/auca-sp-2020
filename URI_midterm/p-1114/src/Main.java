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

       String password;
       password = sc.nextLine();

        while(!password.equals("2002"))
        {
            System.out.println("Senha Invalida");
            password = sc.nextLine();
        }

        System.out.println("Acesso Permitido");
    }
}
