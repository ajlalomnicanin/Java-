import java.util.Scanner;

public class Zadaci2 {
    public static void main(String[] args) {
//        Zadatak 1
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        String prezime = scanner.nextLine();
        int broj_godina =Integer.parseInt (scanner.nextLine());
        String grad = scanner.nextLine();
        System.out.printf("ti si %s , a prezivas se %s , imas %d godina, zivis u %s%n",ime,prezime,broj_godina,grad);

//        Zadatak 2
        String name = scanner.nextLine();
        int number =Integer.parseInt (scanner.nextLine());
        System.out.printf("Arhitekt %s, %d sati je potrebno za %d a projekta %n",name,number*3,number);

//        Zadatak 3
        int psi = Integer.parseInt(scanner.nextLine());
        int macke = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f USD %n ",psi *2.5+macke*4);

//        Zadatak 4
        double broj_kvadrata = Double.parseDouble(scanner.nextLine());
        double  ukupan_racun_bez_popusta = broj_kvadrata * 7.61;
        double  popust = ukupan_racun_bez_popusta/100*18;
        double  konacan_racun = ukupan_racun_bez_popusta + popust ;
        System.out.printf("Konacna cena je %.2f%n", konacan_racun);
        System.out.printf("Za popust cena je %.2f%n", popust);


    }
}
