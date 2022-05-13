import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pistelista pistelista = new Pistelista();
        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");

        while (true) {
            int pisteet = Integer.parseInt(lukija.nextLine());

            if (pisteet == -1) {
                break;
            }
            if (pisteet >= 0 && pisteet <= 100) {
                pistelista.lisaaPisteet(pisteet);
            }
        }
        System.out.println(pistelista);
        pistelista.tulostaArvosanaJakauma();
    }
}
