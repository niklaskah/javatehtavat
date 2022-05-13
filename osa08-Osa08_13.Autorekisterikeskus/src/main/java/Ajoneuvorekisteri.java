import java.util.ArrayList;
import java.util.HashMap;

public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (this.omistajat.containsKey(rekkari) && !this.omistajat.get(rekkari).isEmpty()) {
            return false;
        }
        this.omistajat.put(rekkari, omistaja);
        return true;
    }

    public String hae(Rekisterinumero rekkari) {
        if (this.omistajat.containsKey(rekkari)) {
            return this.omistajat.get(rekkari);
        }
        return null;
    }

    public boolean poista(Rekisterinumero rekkari) {
        if (this.omistajat.containsKey(rekkari)) {
            this.omistajat.remove(rekkari);
            return true;
        }
        return false;
    }

    public void tulostaRekisterinumerot() {
        for (Rekisterinumero rekkari : this.omistajat.keySet()) {
            System.out.println(rekkari);
        }
    }

    public void tulostaOmistajat() {
        ArrayList<String> tulostettavat = new ArrayList<>();

        for (String omistaja : this.omistajat.values()) {
            if (tulostettavat.contains(omistaja)) {
                continue;
            }
            System.out.println(omistaja);
            tulostettavat.add(omistaja);
        }
    }

}
