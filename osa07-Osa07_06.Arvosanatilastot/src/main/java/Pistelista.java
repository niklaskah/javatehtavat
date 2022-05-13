import java.util.ArrayList;

public class Pistelista {
    private ArrayList<Arvosana> pistelista;

    public Pistelista() {
        this.pistelista = new ArrayList<>();
    }

    public void lisaaPisteet(int pisteet) {
        pistelista.add(new Arvosana(pisteet));
    }

    private double laskeListanKeskiarvo(ArrayList<Arvosana> lista) {
        if (lista.isEmpty() == true) {
            return 0;
        }
        float summa = 0;
        for (Arvosana arvosana : lista) {
            summa += arvosana.getPisteet();
        }
        return summa / lista.size();
    }

    public double laskeKaikkienKeskiarvo() {
        return laskeListanKeskiarvo(pistelista);
    }

    public double laskeHyvaksyttyjenKeskiarvo() {
        ArrayList<Arvosana> hyvaksytyt = new ArrayList<>();
        for (Arvosana arvosana : pistelista) {
            if (arvosana.isHyvaksytty() == true) {
                hyvaksytyt.add(arvosana);
            }
        }
        return laskeListanKeskiarvo(hyvaksytyt);
    }

    public double laskeHyvaksymisProsentti() {
        if (pistelista.isEmpty() == true) {
            return 0;
        }
        int hyvaksytyt = 0;
        for (Arvosana arvosana : pistelista) {
            if (arvosana.isHyvaksytty() == true) {
                hyvaksytyt++;
            }
        }
        return 100 * 1.0 * hyvaksytyt / pistelista.size();
    }

    private String tulostaTahtia(int luku) {
        String tulostettava = "";
        for (int i = 0; i < luku; i++) {
            tulostettava += "*";
        }
        return tulostettava;
    }

    public void tulostaArvosanaJakauma() {

        for (int etsittavaArvosana = 5; etsittavaArvosana >= 0; etsittavaArvosana--) {
            int loydetty = 0;
            for (Arvosana arvosana : pistelista) {
                if (arvosana.getArvosana() == etsittavaArvosana) {
                    loydetty++;
                    System.out.println(etsittavaArvosana + " löytynyt " + loydetty);
                }

            }
            System.out.println(etsittavaArvosana + ": " + tulostaTahtia(loydetty));
        }
    }

    @Override
    public String toString() {
        String tulostettava = "";
        tulostettava += "Pisteiden keskiarvo (kaikki): " + laskeKaikkienKeskiarvo() +
                System.lineSeparator();
        if (laskeHyvaksyttyjenKeskiarvo() == 0) {
            tulostettava += "Pisteiden keskiarvo (hyväksytyt): -";
        } else {
            tulostettava += "Pisteiden keskiarvo (hyväksytyt):" +
                    laskeHyvaksyttyjenKeskiarvo()
                    + System.lineSeparator();
        }
        tulostettava += "Hyväksymisprosentti: " + laskeHyvaksymisProsentti();

        return tulostettava;
    }

}
