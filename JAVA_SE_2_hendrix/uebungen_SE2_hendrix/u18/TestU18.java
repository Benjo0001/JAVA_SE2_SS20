// Übung 18

// Schreiben Sie eine Klasse zum Speichern von Objekten der Klasse Rechteck. Dabei sollen die Objekte in einer LinkedList gespeichert werden. Die Klasse soll folgende Methoden besitzen:

// Methode zum Speichern eines Objektes (Anhängen an die Liste)
// Methode zum Löschen eines Objektes
// Methode zur Ausgabe der Länge und Breite aller Rechteck-Objekte in der Liste mit Hilfe eines ListIterator-Objektes


import static java.lang.System.*;

public class TestU18 {
    public static void main(String[] args) {
        RechteckStorage rs = new RechteckStorage();
        Rechteck blueR = new Rechteck(6, 12, "blue");

        rs.addRechteck(new Rechteck());
        rs.addRechteck(new Rechteck(10, 10, "yellow"));
        rs.addRechteck(blueR);

        // rs.removeRechteck(blueR);
        rs.removeRechteck(new Rechteck(10, 10, "yello"));

        rs.printAllRectangle();


    }
}