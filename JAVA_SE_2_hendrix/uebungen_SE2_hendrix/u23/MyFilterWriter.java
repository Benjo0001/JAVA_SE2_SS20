import java.io.FilterWriter;

/**
Übung 23

Erstellen Sie eine Filterklasse MyFilterWriter, welche die Ausgaben in eine Datei so filtert,
dass nur Groß- und Kleinbuchstaben in die Datei geschrieben werden. 
Alle anderen Zeichen sind durch das Zeichen * zu ersetzen. Gehen Sie dabei wie folgt vor:

* Leiten Sie Ihre Filterklasse von der abstrakten Klasse FilterWriter ab.

* Rufen Sie im Konstruktor Ihrer Filterklasse den Konstruktor 
    der Superklasse mit dem übergebenen Writer-Objekt auf.  

* Überschreiben Sie die drei write-Methoden der Klasse FilterWriter.

Testen Sie Ihre Filterklasse in einem Programm FilterCharacters.java. 
Dazu soll über die Tastatur eine Zeichenkette eingegeben werden, die dann gefiltert in die Datei filter.dat geschrieben wird.


 * siehe auch: /Users/ben/Documents/02_Java/JAVA_SE2_SS20/JAVA_SE_2_hendrix/JAV9_HerdHeftchen_JAVA/JAV9_Arbeitsdateien/kap17/MyFilterWriter.java
 * 
 */
public class MyFilterWriter extends FilterWriter {

    MyFilterWriter(){
        super();
    }
    
}