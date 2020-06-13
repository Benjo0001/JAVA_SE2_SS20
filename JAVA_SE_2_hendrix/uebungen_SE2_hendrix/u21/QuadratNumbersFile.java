import java.io.*;          

public class QuadratNumbersFile {

    public static void main(String[] args) {
        
        // SETUP

        String path = "/Users/ben/Documents/02_Java/JAVA_SE2_SS20/JAVA_SE_2_hendrix/uebungen_SE2_hendrix/u21/"+File.separator+"dirForQuadrats";
        
        // create temp dir
        File dir = new File(path);


        if (dir.exists()) {
            System.out.println("\nDas Verzeichnis "+dir.getPath() + " existiert schon.");
            }
        else {
            if(dir.mkdirs()){
                System.out.println("\nDas Verzeichnis "+dir.getName()+" wurde neu erstellt in\n"+dir.getPath());
            }else{
                System.out.println("\nDas Verzeichnis "+dir.getPath()+" konnte nicht erstellt werden");
            }
        }
    

        // nicht notwendig, erstellen der datei macht RandomAccessFile im rw (read write) mode selbst

        // create local file
        // File quadratsFile = new File((dir+File.separator+"quadratzahlen.dat"));

        // // neue Textdatei im Verzeichnis JavaBspDir erzeugen

        // try {
        //     if(quadratsFile.createNewFile()){
        //         System.out.println("Die Datei " + quadratsFile.getName() + " wurde neu erstellt.\n");
        //     }else{
        //         System.out.println("Die Datei " + quadratsFile.getName() + " existiertierte bereits.\n");
        //     }
        // }
        // catch (IOException ex) {
        //     System.out.println("\nFehler: Das Verzeichnis "+quadratsFile.getName()+" konnte nicht erstellt werden\n");
        // }


        // CREATE QUADRATS


        // WRTIE QUADRATS INTO FILE



        // RandomAccessFile quadratsFile;
        // try {
        // quadratsFile = new RandomAccessFile("quadratzahlen.dat", "rw");
        // quadratsFile.writeBytes("AAAAA\nBBBBB\nCCCCC\n");
        // quadratsFile.seek(0); // an den Dateianfang
        // for (int i = 1; i <=3; i++) { // 3 Zeilen lesen
        // System.out.println(quadratsFile.readLine());
        // }
        // quadratsFile.writeBytes("DDDDD\nEEEEE\nFFFFF\n");
        // quadratsFile.seek(0);
        // for (int i = 1; i <=6; i++) { // 6 Zeilen lesen
        // System.out.println(quadratsFile.readLine());
        // }
        // quadratsFile.close();
        // }
        // catch (FileNotFoundException fnf) {
        // System.out.println(fnf.getMessage());
        // }
        // catch (IOExceotion io) {
        // System.out.println(io.getMessage());
        // }
    }
}