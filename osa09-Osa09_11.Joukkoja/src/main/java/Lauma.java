import java.util.ArrayList;

public class Lauma implements Siirrettava {
    private ArrayList<Siirrettava> lauma;

    public Lauma() {
        this.lauma = new ArrayList<>();
    }

    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.lauma.add(siirrettava);
    }

    @Override
    public String toString() {
        String tulostettava = "";
        for (Siirrettava elio : this.lauma) {
            tulostettava += elio.toString() + "\n";
        }
        return tulostettava;
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava elio : this.lauma) {
            elio.siirra(dx, dy);
        }
    }

}
