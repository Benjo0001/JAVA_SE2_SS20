public class PKW extends Automobil {
    private String farbe;
    private String sek; //schadstoffemissions-Klasse
    // PKW hat auch alle Attribute und Methoden von Automobil geerbt

    public PKW(String sek, String farbe){
        this.sek = sek;
    }

}