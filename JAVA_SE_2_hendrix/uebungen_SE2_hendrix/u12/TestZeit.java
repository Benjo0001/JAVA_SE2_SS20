/**
 * TestZeit
 * 
Übung 12

Definieren Sie eine Klasse Zeit, die geeignete Methoden zum Ändern und Ermitteln einer gespeicherten Uhrzeit besitzt (Stunde, Minute).
Leiten Sie von der Klasse Zeit eine abstrakte Klasse ZeitFormat ab, die eine abstrakte Methode zur Ausgabe der Zeitangabe auf der Konsole besitzt.
Leiten Sie von der abstrakten Klasse ZeitFormat die Klassen ZeitFormat24 und ZeitFormat12 ab, und implementieren Sie dort jeweils die abstrakte Methode der Klasse ZeitFormat.
Schreiben Sie eine Klasse TestZeit zum Testen der Ausgabemethoden.
 */

public class TestZeit {

    public static void main(String[] args) {
        ZeitFormat zeit24 = new ZeitFormat24(10, 20);
        ZeitFormat zeit12 = new ZeitFormat12(10, 20);

        ZeitFormat t2 = new ZeitFormat24(20, 20);
        ZeitFormat t3 = new ZeitFormat12(20, 20);

        zeit24.printTime();
        zeit12.printTime();

        t2.printTime();
        t3.printTime();

    }
}