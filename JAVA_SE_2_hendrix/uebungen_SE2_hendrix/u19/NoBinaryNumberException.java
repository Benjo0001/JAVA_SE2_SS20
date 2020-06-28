/**
    Übung 19

    Erzeugen Sie eine neue Exception NoBinaryNumberException,
    die von der Klasse RuntimeException abgeleitet ist.
    Sie soll neben den beiden Standardkonstruktoren einen weiteren Konstruktor besitzen,
    der einen String (eine Binärzahl in der Form "10001110") sowie die Position, die die Exception ausgelöst hat, entgegennimmt.

    Schreiben Sie eine Klasse ConvertBinary, die eine im String-Format übergebene Binärzahl in einen int-Typ umwandelt.
    Wird keine korrekte Zahl zur Umwandlung übergeben, soll eine Exception vom Typ NoBinaryNumberException ausgelöst werden.

    Schreiben Sie eine Klasse ConvertBinaryTest zum Testen der Umwandlung.
 */
public class NoBinaryNumberException extends RuntimeException {

    public NoBinaryNumberException(String msg){
        super(msg);
    }

    public NoBinaryNumberException(){
        super();
    }

    public NoBinaryNumberException(String binary, int pos){
        super(binary + " ist keine Binärzahl, Stelle: "+pos);
    }

    
}