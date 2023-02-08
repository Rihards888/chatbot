import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        //1.jautājums

        System.out.println("1. Jautājums: Kurā mēnesī sākās RCS programmēšanas kursi?");

        String atbilde1 = input.nextLine();

        if (atbilde1.equalsIgnoreCase("janvārī")) {
            System.out.println("Precīzi!");

        } else {
            System.out.println("Nē "+ atbilde1 + " nebūs pareizi! Atbilde ir Janvārī.");
        }

        //2.jautājums

        System.out.println("2. Jautājums: Kādu programmēšanas valodu Tu patreiz mācies?");

        String atbilde2 = input.nextLine();

        if (atbilde2.equalsIgnoreCase("java") ) {
            System.out.println("Precīzi!");
        } else {
            System.out.println("Kļūda, " + atbilde2 + " nebūs īstā! Tu patreiz mācies Java.");
        }

        //3.jautājums

        System.out.println("3. Jautājums: Vai Java ir OOP (Object-oriented programming) valoda ?");

        String atbilde3 = input.nextLine();

        if (atbilde3.equalsIgnoreCase("jā") ) {
            System.out.println("Nu gan Tu esi gudrinieks!");
        } else {
            System.out.println("Kļūdies! Jo atbilde ir Jā, Java ir OOP valoda.");
        }

        System.out.println("Paldies par sarunu!");


    }
}
