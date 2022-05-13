
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        // String tiedosto = "reseptit.txt";
        String tiedosto = lukija.nextLine();
        Reseptilista reseptit = new Reseptilista();
        try (Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))) {

            ArrayList<String> reseptinTiedot = new ArrayList<>();

            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                reseptinTiedot.add(rivi);
                System.out.println(rivi);
                if (rivi.equals("") || !tiedostonlukija.hasNext()) {
                    System.out.println("rivi oli tyhjä");
                    reseptit.lisaaResepti(reseptinTiedot);
                    reseptinTiedot = new ArrayList<>();

                }
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        System.out.println("Komennot:\n"
                + "listaa - listaa reseptit\n"
                + "lopeta - lopettaa ohjelman\n"
                + "hae nimi - hakee reseptiä nimen perusteella\n"
                + "hae keittoaika - hakee reseptiä keittoajan perusteella\n"
                + "hae aine - hakee reseptiä raaka-aineen perusteella");

        while (true) {
            System.out.println("Syötä komento: ");
            String komento = lukija.nextLine();

            if (komento.equals("listaa")) {
                System.out.println(reseptit);
            }
            if (komento.equals("hae nimi")) {
                System.out.println("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                reseptit.haeNimella(haettava);
            }
            if (komento.equals("hae keittoaika")) {
                System.out.println("Keittoaika korkeintaan ");
                int keittoAika = Integer.valueOf(lukija.nextLine());
                reseptit.haeKeittoAjalla(keittoAika);
            }
            if (komento.equals("hae aine")) {
                System.out.println("Mitä raaka-ainetta haetaan: ");
                String haettava = lukija.nextLine();
                reseptit.haeRaakaAineella(haettava);
            }
            if (komento.equals("lopeta")) {
                break;
            }
        }
    }
}
