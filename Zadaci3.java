import java.util.Scanner;

public class Zadaci3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double kolicina_dolara =Double.parseDouble(scanner.nextLine());
        System.out.printf("%f%n",kolicina_dolara * 1.78549);

//        2. zadatak
        double ugao_u_radijanima = Double.parseDouble(scanner.nextLine());
        System.out.println(ugao_u_radijanima * 180/Math.PI);

//        3.zadatak
        double ulozeni_novac = Double.parseDouble(scanner.nextLine());
        int broj_meseci_stednje = Integer.parseInt(scanner.nextLine());
        double godisnja_kamata= Double.parseDouble(scanner.nextLine());

        double godisnja_zarada = ulozeni_novac * godisnja_kamata / 100;
        double mesecna_zarada = godisnja_zarada/12;

        double za_isplatu = ulozeni_novac * broj_meseci_stednje * mesecna_zarada;
        System.out.printf("%.2f", za_isplatu);

//        4.zadatak
        int  ukupno_stranica = Integer.parseInt(scanner.nextLine()) ;
        int  broj_stranica_po_satu = Integer.parseInt(scanner.nextLine()) ;
        int broj_dana = Integer.parseInt(scanner.nextLine()) ;
        int ukupno_sati = ukupno_stranica/broj_stranica_po_satu;
        int broj_sati_po_danu = ukupno_sati / broj_dana;

        System.out.println(broj_sati_po_danu);

//        5.zadatak

        int broj_olovki = Integer.parseInt(scanner.nextLine());
        int broj_markera = Integer.parseInt(scanner.nextLine());
        int broj_litara_deterdzenta = Integer.parseInt(scanner.nextLine());
        int procenat_popust = Integer.parseInt(scanner.nextLine());

//        koliki je racun bez popusta
        double stavka_olovke = broj_olovki * 5.8;
        double stavka_markeri = broj_markera * 7.2;
        double stavka_deterdzent = broj_litara_deterdzenta * 1.2;

        double ukupno_bez_popusta = stavka_olovke + stavka_markeri + stavka_deterdzent;
        double ukupno_za_uplatu = (100 -(double) procenat_popust)/100 *ukupno_bez_popusta;

        System.out.println(ukupno_za_uplatu);

//      6.zadatak
        int broj_kvadrata_najlona = Integer.parseInt(scanner.nextLine());
        int broj_litara_boje = Integer.parseInt(scanner.nextLine());
        int kolicina_deterdzenta = Integer.parseInt(scanner.nextLine());
        int broj_sati = Integer.parseInt(scanner.nextLine());

        double stavka_najlona = (broj_kvadrata_najlona + 2 ) *1.25 ;
        double stavka_boja = ( broj_litara_boje * 1.1 ) * 14.5 ;
        double stavka_deterdzenta = kolicina_deterdzenta *5.0;
        double stavke_kese = 0.4;
        double ukupno = stavka_najlona + stavka_boja + stavka_deterdzenta + stavke_kese ;

        double cena_radnog_sata = ukupno * 0.30 ;
        double uukupno_za_mastore =  broj_sati * cena_radnog_sata;
        double ukupno_za_placanje = ukupno + uukupno_za_mastore;

        System.out.printf("%.2f",ukupno_za_placanje);;

//        7.zadatak




    }
      }