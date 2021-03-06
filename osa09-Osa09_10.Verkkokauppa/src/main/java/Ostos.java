public class Ostos {
    private String tuote;
    private int kpl;
    private int yksikkohinta;

    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;
    }

    public String getTuote() {
        return this.tuote;
    }

    public void setTuote(String tuote) {
        this.tuote = tuote;
    }

    public int getKpl() {
        return this.kpl;
    }

    public void setKpl(int kpl) {
        this.kpl = kpl;
    }

    public int getYksikkohinta() {
        return this.yksikkohinta;
    }

    public void setYksikkohinta(int yksikkohinta) {
        this.yksikkohinta = yksikkohinta;
    }

    public int hinta() {
        return this.kpl * this.yksikkohinta;
    }

    public void kasvataMaaraa() {
        this.kpl++;
    }

    @Override
    public String toString() {
        return getTuote() + ": " + getKpl();
    }

}
