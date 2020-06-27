/** 
 * HashSet
 * Datenstruktur um Werte zu speichern
 * Reihenfolge ist NICHT sichergestellt (kann sich im Laufe umsortieren)
 * Konstante Zeit für add, remove, contains und size
 * 
 *
 * Tutorial: JavaWebAndMore
 * https://www.youtube.com/watch?v=a1f5QntJCoo
 */
// import java.util.*;
import java.util.HashSet;

public class HashSet_jwm {
     // "aktuell gesetztes" dictionary


    public static void main(String[] args) {
        

        HashSet<String> myhs = new HashSet<String>();
        myhs.add("Nele");
        myhs.add("Ben");
        myhs.add("Lukas");
        myhs.add("Klausi");


        System.out.println("\n\n");
        for (String name : myhs) {
            System.out.println(name);
        }
        System.out.println("---- ---- ----");
        myhs.remove("Klausi");
        myhs.remove("NichtDring");  // auch nicht schlimm wenn man versucht nicht enthaltenes Objekt zu entfernen
        myhs.add("Nele");           // auch doppelt einfügen ist möglich
        for (String name : myhs) {
            System.out.println(name);
        }

        myhs.add("Nele");
        myhs.add("Nele");
        try {
            myhs.add("Nele");    
        } catch (Exception e) {
            System.out.println("Can not add Nele, already in");
        }
        

        System.out.println("\n\n");

    }
}