/**
 * Merke: abstrakte Klassen || Interfaces können nicht instanziiert werden!
 * abstrakte Klassen können: Variablen,  auch fertig implementierte Methoden
 * die Methoden(aufrufe) aus den Interfaces werden schon durch implements übernommen (müssen nicht zwangsläufig hier definiert werden)
 * 
 */



// Tier wird nur abstract definiert, es kann dann immer nur ein konkretes Tier erstellt werden
// Tier kann jetzt nicht mehr als =new Tier(); instanziiert werden

public abstract class Tier implements Lebewesen {
    int beine;
    String name;
    int augen;

    public String macheDichBemerkbar() {
        return "hey";
    }

    // add unimplemented methods nicht mehr notwendig durch abstract
    // @Override
    // public void atme() {
    //     System.out.println("schnauf");
    // }

    public abstract void laufe();
}

// alter code (Interfaces)
// implements == erfüllt / implementiert
// public class Tier implements Lebewesen {
//     int beine;
//     String name;
//     int augen;

//     public String macheDichBemerkbar() {
//         return "hey";
//     }

//     // add unimplemented methods
//     @Override
//     public void atme() {
//         System.out.println("schnauf");
//     }
// }