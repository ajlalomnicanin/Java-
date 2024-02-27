import java.util.Scanner;

public class Zadaci1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite dve vrednosti");
        int a =Integer.parseInt(scanner.nextLine());
        int b =Integer.parseInt(scanner.nextLine());
        int c =Integer.parseInt(scanner.nextLine());
        int d =Integer.parseInt(scanner.nextLine());

//        Aritmeticke operacije :
        System.out.println("Zbir ova dva broja je: " + (a + b));
        System.out.println("Razlika ova dva broja je: " + (a - b));
        System.out.println("Proizvod ova dva broja je: " + (a * b));
        System.out.println("Kolicnik ova dva broja je: " + ((double)a / b));

//      konverzacija se vrdi tako sto pre naziva varijable u zagradi
//      upisemo tip podataka u koji zelimo da konvertujemo

//        Modul je ostatak pri celobrojnom deljenju
        System.out.println("Modul ova dva broja je: " + (a % b));

//
        System.out.printf("Zbir brojeva %d i %d je : %d%n",a,b,(a+b));
//      String - %s
//      double - %f
//      int - %d
//      char - %c
//      new line - %n
//        zaokruzivanje na dve decimale
        System.out.printf("Kolicnik brojeva %d i %d je %.2f%n",a,b,((double)a/b));
//        zaokruzivanje na dve decimale %.2(ovo 2 je na dve decimale)f%n
        System.out.printf("Kolicnik brojeva %d i %d je %.3f%n",a,b,((double)a/b));
        System.out.printf("Kolicnik brojeva %d, %d, %d i %d je %d%n",a,b,c,d,(a+b+c+d));


    }
}
