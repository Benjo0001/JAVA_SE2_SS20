
import java.util.LinkedList;

public enum Muenze {
    
    // * so würde es in einer normalen Klasse ausschauen
    //static final: damit Zugriff von außen ohne Instanziierung möglich
    // public static final einCent = new Muenze(1);
    // public static final zweiCent = new Muenze(2);
    //...

    //Verwenden des Enums

    // all diese sind automatisch vom Typ Muenzen
    //einCent(1), zweiCent(2), fuenfCent(5), zehnCent(10), zwanzigCent(20), fuenfzigCent(50), einEuro(100), zweiEuro(200);
    zweiEuro(200), einEuro(100), fuenfzigCent(50), zwanzigCent(20), zehnCent(10), fuenfCent(5), zweiCent(2), einCent(1);
    // es gibt nur diese 8, es können keine weiteren von außen Instanziiert werden

    private int wert;

    Muenze(int wert){ 
        this.wert = wert;
    }

    public int getWert() {
        return wert;
    }


    /**
     * Implementieren Sie eine Methode die das Wechselgeld in Münzen umwandelt (möglichst wenig Münzen)
     */
    public static LinkedList<Muenze> getWechselgeld(int wertInCent){

        LinkedList<Muenze> wechselgeld = new LinkedList<>();

        for(int i = 0; i < values().length; i++ ) {

            Muenze aktuelleMuenze = values()[i];

            if(aktuelleMuenze.getWert() <= wertInCent){
                wechselgeld.add(aktuelleMuenze);
                wertInCent -= aktuelleMuenze.getWert();
                i--;    
            }
        }
        return wechselgeld;
    } 
    
}