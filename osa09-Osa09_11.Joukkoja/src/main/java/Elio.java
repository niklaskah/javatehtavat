public class Elio implements Siirrettava {
    private int x;
    private int y;

    public Elio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void siirra(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    @Override
    public String toString() {
        return "x: " + getX() + "; y: " + getY();
    }

}
