/**
 * Abstract classes
 * 
 * https://www.youtube.com/watch?v=QjZ_XeYTwS0
 * 
 * Wofür brauchen wir die eigentlich?
 * -> Sammlung von Objekten die sich nur in gewissen Eigenschaften unterscheiden und ansonsten gleich sind
 * 
 */


// abstract == Vorlage für richtige Objekte mit einzelnen Unterschieden

public abstract class Kuenstler {
    
    public String name = null;

    public Kuenstler(String name) {
        this.name = name;
    }

    public void vorstellen() {
        System.out.println("Hallo ich bin "+name);
    }

    // hier drin unterscheiden sich die Kuenstler alle ... alle eine andere Performance
    // hier Angabe von Rückgabewert und Parameterliste und das es eine abstrakter Methodenaufruf ist (abstract)
    // abstracte Methode(n Definition) ohne Implementierung -> nicht Möglich davon Abstanzen zu erzeugen 
    public abstract void performance();

    public void verbeugung() {
        System.out.println("Danke Danke!");
    }
}