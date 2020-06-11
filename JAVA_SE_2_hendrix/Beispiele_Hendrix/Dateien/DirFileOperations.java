import java.io.*;

class DirFileOperations {
    public static void main(String[] args) {
        // schauen ob Verzeichnis: JavaBspDir in aktuellem Ordner schon existiert, ansonsten neues Verzeichnis erstellen
        String separator = File.separator;
        String dirName = "/Users/ben/Documents/"+"02_Java"+separator+"JAVA_SE2_SS20"+separator+"JAVA_SE_2_hendrix"+separator+"Beispiele_Hendrix" +separator + "Dateien" + separator + "JavaBspDir";
        File dir = new File(dirName);
        if (dir.exists()) {
        System.out.println("\nDas Verzeichnis "+dir.getPath() + " existiert schon.");
        }
        else {
        dir.mkdir();
        System.out.println("\nDas Verzeichnis "+dir.getName()+"wurde neu erstellt in\n"+dir.getPath());
        }

        // neue Textdatei im Verzeichnis JavaBspDir erzeugen
        String fileName = dirName+separator+"Bsp.txt";
        File file = new File(fileName);
        if (file.exists()) {
        System.out.println(file.getName() + " existiert schon.\n");
        }
        else {
            try {
            file.createNewFile();
            System.out.println("Die Datei " + file.getName() + " wurde neu erstellt.\n");
            }
            catch (IOException ex) {
                ex.printStackTrace();
             }
        }
    }
}