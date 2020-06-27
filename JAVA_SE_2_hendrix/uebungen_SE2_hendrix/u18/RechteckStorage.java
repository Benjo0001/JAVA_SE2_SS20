// package uebungen_SE2_hendrix.u18;
/**
 * Übung 18

    Schreiben Sie eine Klasse zum Speichern von Objekten der Klasse Rechteck.
    Dabei sollen die Objekte in einer LinkedList gespeichert werden. 
    Die Klasse soll folgende Methoden besitzen:

    Methode zum Speichern eines Objektes (Anhängen an die Liste)
    Methode zum Löschen eines Objektes
    Methode zur Ausgabe der Länge und Breite aller Rechteck-Objekte in der Liste
    mit Hilfe eines ListIterator-Objektes
 */
    // import uebungen_SE2_hendrix.u16.Rechteck;  // did not work in VS code - dont now... -> next project
    // https://www.youtube.com/watch?v=jtVvhbVAcdk

import java.util.LinkedList;
import java.util.ListIterator;
import static java.lang.System.*;

public class RechteckStorage {
    
    private LinkedList<Rechteck> list;

    RechteckStorage(){
        list = new LinkedList<Rechteck>();
    }
    
    public void addRechteck(Rechteck r){
        list.add(r);
    }

    public void removeRechteck(Rechteck r){
        if(list.contains(r)){
            list.remove(list.indexOf(r));
        }else{
            out.println("Dreieck wurde nicht gefunden in der Liste und konnte nicht entfernt werden");
            System.out.println("OMG");
        }
    }

    public void printAllRectangle(){
        ListIterator li = list.listIterator();
        while(li.hasNext()){
            out.println(li.next().toString());
        }
    }  
    
}