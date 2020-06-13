import java.io.*;

class DirFileOperations_v1 {
    public static void main(String[] args) {

        // neues Verzeichnis erstellen (und schauen ob Verzeichnis schon existiert)

        // Seperator des Systems erkennen und den Pfad erstellen
        String separator = File.separator;

        //String dirName = "/Users/ben/Documents/02_Java/JAVA_SE2_SS20/JAVA_SE_2_tutorial_Almus/examples_WS_Almus/" +separator + "Dateien_2" + separator + "JavaBspDir";
        // Achtung dir.mkdir() kann nur 1 Verzeichnis anlegen
        //mkdirs() kann mehrere Verzeichnisse (ineinander verschachtelt) anlegen
        
        String dirName = "/Users/ben/Documents/02_Java/JAVA_SE2_SS20/JAVA_SE_2_tutorial_Almus/examples_WS_Almus/" +separator + "Dateien" + separator + "JavaBspDir";

        File dir = new File(dirName);
        System.out.println("Verzeichnis(pfad): "+dir.getAbsolutePath() + "der noch temporären Datei in Java");

        if (dir.exists()) {
        System.out.println("\nDas Verzeichnis "+dir.getPath() + " existiert schon.");
        }
        else {
            if(dir.mkdir()){
                System.out.println("\nDas Verzeichnis "+dir.getName()+" wurde neu erstellt in\n"+dir.getPath());
            }else{
                System.out.println("\nDas Verzeichnis "+dir.getPath()+" konnte nicht erstellt werden");
            }
        
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
                System.out.println("\nDas Verzeichnis "+file.getName()+" konnte nicht erstellt werden\n");
                // ex.printStackTrace();
             }
        }
    }
}