import java.util.Scanner;

public class Sesti_cas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj_god;
        double visina;

        System.out.println("Unesite broj godina");
        broj_god = Integer.parseInt(scanner.nextLine());
//      konvertujemo string u celobrojnu vrednost

        System.out.println("Unesite visinu u metrima");
        visina = Double.parseDouble(scanner.nextLine());
        //  konvertujemo string u decimalnu vrednost;

    }
}
