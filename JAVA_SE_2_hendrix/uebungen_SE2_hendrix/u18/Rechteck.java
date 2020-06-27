// package uebungen_SE2_hendrix.u16;
import java.util.Objects;

public class Rechteck {
    private int breite;
    private int laenge;
    private String farbe;

    public Rechteck(){
        this.breite = 0;
        this.laenge = 0;
        this.farbe = "grün";
    }

    public Rechteck(int breite, int laenge, String farbe) {
        this.breite = breite;
        this.laenge = laenge;
        this.farbe = farbe;
    }

    public int getBreite() {
        return breite;
    }
    public String getFarbe() {
        return farbe;
    }
    public int getLaenge() {
        return laenge;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }


    @Override
    public boolean equals(Object o) {
        // wenn beide Instanzen identisch sind
        if (o == this)
            return true;
        if (!(o instanceof Rechteck)) {
            return false;
        }
        Rechteck rechteck = (Rechteck) o;
        // wenn beide Objekte die gleichen Eigenschaften haben
        return rechteck.getBreite() == this.getBreite() && rechteck.getFarbe() == this.getFarbe() && rechteck.getLaenge() == this.getLaenge();
    }


    @Override
    public int hashCode() {
        // return Objects.hash(getBreite(), getLaenge(), getFarbe());
        return Objects.hash(breite, laenge, farbe);
    }

    @Override
    public String toString() {
        return "{" +
            " breite='" + getBreite() + "'" +
            ", laenge='" + getLaenge() + "'" +
            ", farbe='" + getFarbe() + "'" +
            "}";
    }

    public static void main(String[] args) {
        Rechteck r1 = new Rechteck();
        System.out.println(r1.getBreite());
        System.out.println(r1.getFarbe());
    }

}