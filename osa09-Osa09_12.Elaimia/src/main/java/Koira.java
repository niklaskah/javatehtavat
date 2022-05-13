public class Koira extends Elain implements Aanteleva {
    private String nimi;

    public Koira() {
        this("Koira");
    }

    public Koira(String nimi) {
        super(nimi);
    }

    public void hauku() {
        System.out.println(super.getNimi() + " haukkuu");
    }

    public void aantele() {
        hauku();
    }
}
