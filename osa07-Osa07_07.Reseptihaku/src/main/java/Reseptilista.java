import java.util.ArrayList;

public class Reseptilista {
    private ArrayList<Resepti> reseptilista;

    public Reseptilista() {
        this.reseptilista = new ArrayList<>();
    }

    public void lisaaResepti(ArrayList<String> reseptinTiedot) {
        Resepti resepti = new Resepti(reseptinTiedot.get(0), Integer.valueOf(reseptinTiedot.get(1)));
        for (int i = 2; i < reseptinTiedot.size(); i++) {
            resepti.lisaaRaakaAine(reseptinTiedot.get(i));
        }
        this.reseptilista.add(resepti);
    }

    public void haeNimella(String haettava) {
        for (Resepti resepti : reseptilista) {
            if (resepti.getNimi().contains(haettava)) {
                System.out.println(resepti);
            }
        }
    }

    public void haeKeittoAjalla(int keittoAika) {
        for (Resepti resepti : reseptilista) {
            if (resepti.getKeittoAika() <= keittoAika) {
                System.out.println(resepti);
            }
        }
    }

    public void haeRaakaAineella(String haettava) {
        for (Resepti resepti : this.reseptilista) {
            if (resepti.loytyyRaakaAine(haettava)) {
                System.out.println(resepti);
            }
        }
    }

    @Override
    public String toString() {
        if (this.reseptilista.isEmpty()) {
            return "";
        }
        for (Resepti resepti : this.reseptilista) {
            System.out.println(resepti);
        }
        return "";
    }
}
