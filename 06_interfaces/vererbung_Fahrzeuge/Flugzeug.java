public class Flugzeug implements Fahrzeug {
    protected int anzahlSitze;
    protected String kennzeichen;


    public Flugzeug(){
        System.out.println("Ich bin ein Flugzeug");
    }

    @Override // notiz: die folgende Klasse ist aus einer Oberklasse..
    public void setAnzahlSitze(int a){
        this.anzahlSitze = a;
    }

    @Override
    public int getAnzahlSitze(){
        return anzahlSitze;
    }

    @Override
    public void setKennzeichen(String k){
        this.kennzeichen = k;
    }
    @Override
    public String getKennzeichen() {
        return this.kennzeichen;
    }
    
}