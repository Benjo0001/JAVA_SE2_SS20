/**
    Schreiben Sie eine Klasse ConvertBinaryTest zum Testen der Umwandlung.

    ähnliche Beispiellösung im Jav9 Herd-Heft Seite 198 (Kapitel 14.7 Übungen)
 */

public class ConvertBinaryTest {
    public static void main(String[] args) {
        try {
            System.out.println(ConvertBinary.ConvertBinaryNumberString("001010101") + "\n");    
        } catch (NoBinaryNumberException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(ConvertBinary.ConvertBinaryNumberString("00101g101") + "\n");
        } catch (NoBinaryNumberException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(ConvertBinary.ConvertBinaryNumberString("0001") + "\n");    
        } catch (NoBinaryNumberException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(ConvertBinary.ConvertBinaryNumberString("1111010o1") + "\n");    
        } catch (NoBinaryNumberException e) {
            e.printStackTrace();
        }

        System.out.println(ConvertBinary.ConvertBinaryNumberString("00101g101") + "\n");
        // ohne try catch block wird die NoBinaryNumberException nicht gefangen und stößt bis zur main vor -> Programm stoppt hier
        System.out.println(ConvertBinary.ConvertBinaryNumberString("00101101") + "\n");

    }
}