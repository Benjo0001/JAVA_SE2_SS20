import java.io.*;

/**
 * OptimizedFileRandomAccessFileSample
 */
public class OptimizedFileRandomAccessFileSample {

    public static void main(String[] args) {

        // Absoluter Pfad mit Dateiname
        // --> Die Datei wird in dem angegebenen Pfad erzeugt!
        // String fullFilePath = "C:\\Temp\\MyFile.txt";
        // File myFile = new File(fullFilePath);

        // Relativer Pfad mit Dateiname
        // --> Die Datei wird im aktuellen Verzeichnis
        //     (+ anzulegende Unterverzeichnisse) erzeugt!
        File myFile = new File("subDir" + File.separator + "MyFile.txt");

        // Die Verzeichnisse erstellen, falls nicht vorhanden.
        // Dies ist eine sehr kurze Schreibweise für diese Prüfung
        // Welche Gefahren sehen Sie bei dieser kurzen Schreibweise? Was kann passieren?
        boolean creationNecessary = new File(myFile.getParent()).mkdirs();
        if (creationNecessary) {
            System.out.println("Nicht vorhandene Verzeichnisse wurden erstellt.");
        }

        // Es wird das try-with-resources-Konstrukt verwendet, um die Dateiresource in jedem Fall wieder zu schließen.
        // Es ist also egal, ob die Datei korrekt erstellt und gefüllt werden kann, oder ob eine Exception auftritt.
        // --> Die Datei wird automatisch geschlossen.
        // Dies bedeutet für Sie: 
        // - Wir sparen uns das Deklarieren der Datei und das separate Öffnen
        // - Wir sparen uns das finally.
        try (RandomAccessFile absoluteRaf = new RandomAccessFile(myFile, "rw")) {
            // Die Datei wurde bei Bedarf erstellt.

            // Wir springen zum Ende. (Anfügen)
            absoluteRaf.seek(absoluteRaf.length());

            // Eine Zeile schreiben... Beachten: Deutsches Charset!
            absoluteRaf.write(
                ("Meine erste Zeile in einer RandomAccessFile!"+
                " Was für ein Spaß!!\n")
                .getBytes());
            absoluteRaf.write("Und hier noch eine Zeile...\n".getBytes());
            absoluteRaf.write(
                "Und hier eine Zeile...mit ü und ö...\n".getBytes());

            // Alternativ können Sie es auch so schreiben:
            absoluteRaf.writeBytes(
                "Und hier noch eine weitere Zeile...mit ü und ö...\n");
        } catch (IOException ioex) {
            System.out.println(
                "Ein Fehler ist beim Erstellen der Datei " +
                "und dem Schreiben in die Datei aufgetreten.");
            System.out.println(ioex.toString());
        }

        // Aus der Datei lesen. Aber nur falls sie existiert.
        // Wie könnte man sich hier das Catch mit der FileNotFoundException sparen?
        try (RandomAccessFile raf = new RandomAccessFile(myFile, "r")) {
            // Die Zeilen aus der Datei lesen.
            String line;
            while ((line = raf.readLine()) != null) {
                // Wir wollen den deutschen Text,
                // müssen also auf das Charset achten!
                String utf8 = new String(line.getBytes("ISO-8859-1"), "UTF-8");
                System.out.println(utf8);
            }
        } catch (FileNotFoundException fnfex) {
            System.out.println("Die Datei wurde nicht gefunden!");
        } catch (IOException ioex) {
            System.out.println(
                "Ein Fehler ist beim Öffnen oder Lesen der Datei aufgetreten.");
            System.out.println(ioex.toString());
        }
    }
}