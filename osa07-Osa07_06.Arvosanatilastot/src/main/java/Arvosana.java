public class Arvosana {
    private int pisteet;
    private boolean hyvaksytty;
    private int arvosana;

    public Arvosana(int pisteet) {
        this.pisteet = pisteet;
        if (pisteet >= 50) {
            hyvaksytty = true;
        } else {
            hyvaksytty = false;
        }

        if (pisteet < 50) {
            this.arvosana = 0;
        } else if (pisteet >= 50 && pisteet < 60) {
            this.arvosana = 1;
        } else if (pisteet >= 60 && pisteet < 70) {
            this.arvosana = 2;
        } else if (pisteet >= 70 && pisteet < 80) {
            this.arvosana = 3;
        } else if (pisteet >= 80 && pisteet < 90) {
            this.arvosana = 4;
        } else {
            this.arvosana = 5;
        }
    }

    public int getPisteet() {
        return this.pisteet;
    }

    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    public boolean isHyvaksytty() {
        return this.hyvaksytty;
    }

    public boolean getHyvaksytty() {
        return this.hyvaksytty;
    }

    public int getArvosana() {
        return this.arvosana;
    }

}
