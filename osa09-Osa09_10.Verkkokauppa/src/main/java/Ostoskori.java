import java.util.HashMap;
import java.util.Map;

public class Ostoskori {
    private Map<String, Ostos> ostoskori;

    public Ostoskori() {
        this.ostoskori = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (this.ostoskori.containsKey(tuote)) {
            this.ostoskori.get(tuote).kasvataMaaraa();
        } else {
            this.ostoskori.put(tuote, new Ostos(tuote, 1, hinta));
        }
    }

    public int hinta() {
        int hinta = 0;
        for (Ostos ostos : this.ostoskori.values()) {
            hinta += ostos.hinta();
        }
        return hinta;
    }

    public void tulosta() {
        for (Ostos ostos : this.ostoskori.values()) {
            System.out.println(ostos);
        }
    }

}
