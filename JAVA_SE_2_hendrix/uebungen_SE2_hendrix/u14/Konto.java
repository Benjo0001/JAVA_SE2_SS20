abstract class Konto {
    protected int kontonummer;
    protected String name;
    protected double kontostand;

    Konto(){
        this.kontonummer = 0;
        this.name = "";
        this.kontostand = 0;
    }
    Konto(int kn, String name, double ks){
        this.kontonummer = kn;
        this.name = name;
        this.kontostand = ks;
    }

    abstract void setKontonummer(int kontonummer);
    abstract int getKontonummer();

    abstract void setName(String name);
    abstract String getName();

    abstract void setKontostand(double kontostand);
    abstract double getKontostand();
}