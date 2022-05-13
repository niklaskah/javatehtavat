public class Lintu {
    private String nimi;
    private String latinanimi;
    private int havainnot;

    public Lintu(String nimi, String latinanimi) {
        this.nimi = nimi;
        this.latinanimi = latinanimi;
        this.havainnot = 0;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getLatinanimi() {
        return this.latinanimi;
    }

    public void setLatinanimi(String latinanimi) {
        this.latinanimi = latinanimi;
    }

    public int getHavainnot() {
        return this.havainnot;
    }

    public void setHavainnot(int havainnot) {
        this.havainnot = havainnot;
    }

    @Override
    public String toString() {
        return this.getNimi() + " (" + this.getLatinanimi() + "): " + this.getHavainnot() + " havaintoa";
    }

}
