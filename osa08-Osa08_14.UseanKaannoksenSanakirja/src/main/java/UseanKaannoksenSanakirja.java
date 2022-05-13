import java.util.ArrayList;
import java.util.HashMap;

public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> sanakirja;

    public UseanKaannoksenSanakirja() {
        sanakirja = new HashMap<>();
    }

    public void lisaa(String sana, String kaannos) {
        // uudelle käyttäjälle on lisättävä HashMapiin tyhjä lista jos sitä
        // ei ole jo lisätty
        this.sanakirja.putIfAbsent(sana, new ArrayList<>());

        // haetaan ensin käyttäjän tehtävät sisältävä lista ja tehdään siihen lisäys
        ArrayList<String> kaannokset = this.sanakirja.get(sana);
        kaannokset.add(kaannos);

        // edellinen olisi onnitunut myös ilman apumuuttujaa seuraavasti
        // this.sanakirja.get(sana).add(kaannos);
    }

    public ArrayList<String> kaanna(String sana) {
        return sanakirja.getOrDefault(sana, new ArrayList<>());
    }

    public void poista(String sana) {
        sanakirja.remove(sana);
    }

}
