import java.awt.geom.Arc2D;
import java.util.Scanner;

public class Sedmi_cas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());
        System.out.println(a * b);

//        2. zadatak
        double inches = Double.parseDouble(scanner.nextLine());
        System.out.println(inches * 2.54);

//        3.zadatak
        String ime = scanner.nextLine();
        System.out.println("Hello, " + ime + "!");


    }
}
