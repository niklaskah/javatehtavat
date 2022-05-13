
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        ArrayList<Lintu> linnut = new ArrayList<>();

        while (true) {
            String komento = lukija.nextLine();

            if (komento.equals("Lisaa")) {
                System.out.println("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.print("Latinankielinen nimi: ");
                String latinanimi = lukija.nextLine();
                Lintu lintu = new Lintu(nimi, latinanimi);
                linnut.add(lintu);
            }
            if (komento.equals("Havainto")) {
                System.out.println("Mikä havaittu? ");
                String nimi = lukija.nextLine();
                for (Lintu lintu : linnut) {
                    if (lintu.getNimi().equals(nimi)) {
                        lintu.setHavainnot(lintu.getHavainnot() + 1);
                    } else {
                        System.out.println("Ei ole lintu!");
                    }
                }
            }
            if (komento.equals("Tilasto")) {
                for (Lintu lintu : linnut) {
                    System.out.println(lintu);
                }
            }
            if (komento.equals("Nayta")) {
                System.out.println("Mikä? ");
                String nimi = lukija.nextLine();
                for (Lintu lintu : linnut) {
                    if (lintu.getNimi().equals(nimi)) {
                        System.out.println(lintu);
                    } else {
                        System.out.println("Ei ole lintu!");
                    }
                }
            }
            if (komento.equals("Lopeta")) {
                break;
            }
        }

    }

}
