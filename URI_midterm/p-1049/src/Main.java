import java.util.Scanner;

/**
 * @author  Yiman
 *
 * */

public class Main {
    // Main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1,s2,s3;
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();

        switch (s1)
        {
            case "vertebrado":
                switch (s2)
                {
                    case "ave":
                        switch(s3)
                        {
                            case "carnivoro":
                                System.out.println("aguia");
                                break;
                            case "onivoro":
                                System.out.println("pomba");
                                break;
                        }
                        break;
                    case "mamifero":
                        switch(s3)
                        {
                            case "onivoro":
                                System.out.println("homem");
                                break;
                            case "herbivoro":
                                System.out.println("vaca");
                                break;
                        }
                        break;
                }
                 break;

            case "invertebrado":
                switch (s2)
                {
                    case "inseto":
                        switch(s3)
                        {
                            case "hematofago":
                                System.out.println("pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                        }
                        break;
                    case "anelideo":
                        switch(s3)
                        {
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;
                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
