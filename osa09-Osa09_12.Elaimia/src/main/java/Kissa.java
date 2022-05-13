public class Kissa extends Elain implements Aanteleva {
    private String nimi;

    public Kissa() {
        this("Kissa");
    }

    public Kissa(String nimi) {
        super(nimi);
    }

    public void mourua() {
        System.out.println(super.getNimi() + " mouruaa");
    }

    public void aantele() {
        mourua();
    }

}
