import java.util.ArrayList;

public class Resepti {
    private String nimi;
    private int keittoAika;
    private ArrayList<String> raakaAineet;

    public Resepti(String nimi, int keittoAika) {
        this.nimi = nimi;
        this.keittoAika = keittoAika;
        this.raakaAineet = new ArrayList<>();
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getKeittoAika() {
        return this.keittoAika;
    }

    public void setKeittoAika(int keittoAika) {
        this.keittoAika = keittoAika;
    }

    public ArrayList<String> getRaakaAineet() {
        return this.raakaAineet;
    }

    public void setRaakaAineet(ArrayList<String> raakaAineet) {
        this.raakaAineet = raakaAineet;
    }

    public void lisaaRaakaAine(String raakaaine) {
        if (!this.raakaAineet.contains(raakaaine)) {
            this.raakaAineet.add(raakaaine);

        }
    }

    public boolean loytyyRaakaAine(String haettava) {
        return this.raakaAineet.contains(haettava);
    }

    @Override
    public String toString() {
        return this.getNimi() + ", keittoaika: " + this.getKeittoAika();
    }

}
