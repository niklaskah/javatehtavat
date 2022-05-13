import java.util.ArrayList;
import java.util.HashMap;

public class Kellari {
    HashMap<String, ArrayList<String>> komerot;

    public Kellari() {
        this.komerot = new HashMap<>();
    }

    public void lisaa(String komero, String tavara) {

        // uusi lista jos sitä ei ole lisätty
        this.komerot.putIfAbsent(komero, new ArrayList<>());
        // haetaan lista ja lisätään tavara
        this.komerot.get(komero).add(tavara);
    }

    public ArrayList<String> sisalto(String komero) {
        return this.komerot.getOrDefault(komero, new ArrayList<>());
    }

    public void poista(String komero, String tavara) {
        if (!komerot.get(komero).contains(tavara)) {
            return;
        }

        komerot.get(komero).remove(tavara);

        if (komerot.get(komero).isEmpty()) {
            komerot.remove(komero);
        }
    }

    public ArrayList<String> komerot() {
        ArrayList<String> tulostettavat = new ArrayList<>();

        for (String komero : this.komerot.keySet()) {
            if (komerot.get(komero).isEmpty()) {
                continue;
            }
            tulostettavat.add(komero);
        }
        return tulostettavat;
    }

}
