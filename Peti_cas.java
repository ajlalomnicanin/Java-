import java.util.Scanner;

public class Peti_cas {
    public static void main(String[] args) {
//        Unos sa tastature
        Scanner scanner = new Scanner(System.in);
//        deklarisemo dve varijable
//        od korisnika ocekujemo da ynese ime i prezime
//        na kraju da to prikazemo na ekranu

        String ime;
        String prezime;
        System.out.println("Unesite ime");
        ime = scanner.nextLine();
        System.out.println("Unesite prezime");
        prezime = scanner.nextLine();
//       Ono sto korisnik unese sa tastatture to dodeli varijabli - nextLine()
        System.out.println(ime + " " + prezime);

    }
}