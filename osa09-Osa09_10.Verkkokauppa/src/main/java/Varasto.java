import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Varasto {
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;

    public Varasto() {
        this.hinnat = new HashMap<>();
        this.saldot = new HashMap<>();
    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinnat.put(tuote, hinta);
        this.saldot.put(tuote, saldo);
    }

    public int hinta(String tuote) {
        if (this.hinnat.containsKey(tuote)) {
            return this.hinnat.get(tuote);
        }
        return -99;
    }

    public int saldo(String tuote) {
        if (this.saldot.containsKey(tuote)) {
            return this.saldot.get(tuote);
        }
        return 0;
    }

    public boolean ota(String tuote) {
        if (this.saldot.get(tuote) == null) {
            return false;
        }
        if (this.saldot.get(tuote) == 0) {
            return false;
        }
        this.saldot.put(tuote, saldot.get(tuote) - 1);
        return true;
    }

    public Set<String> tuotteet() {
        Set<String> nimet = this.hinnat.keySet();
        return nimet;
    }
}
