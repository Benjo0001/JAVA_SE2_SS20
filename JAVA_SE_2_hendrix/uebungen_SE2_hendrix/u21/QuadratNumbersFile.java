/**
Übung 21

Schreiben Sie die Zahlen von 1 bis 1000 und die jeweils zugehörige Quadratzahl in eine Datei quadratzahlen.dat.

Lesen Sie die Werte wieder ein und geben die Daten in folgender Weise aus:
. . .
Quadrat von 25 = 625
Quadrat von 26 = 676
. . .
 */
import java.io.*;
import java.util.Iterator;          
public class QuadratNumbersFile {

    public static void main(String[] args) {
        
        // SETUP: create a dir for the quadrats.dat file (optional)
 
        String path = "/Users/ben/Documents/02_Java/JAVA_SE2_SS20/JAVA_SE_2_hendrix/uebungen_SE2_hendrix/u21"+File.separator+"dirForQuadrats";
        
        // create temp dir
        File dir = new File(path);
        //path = "/Users/ben/Documents/02_Java/JAVA_SE2_SS20/JAVA_SE_2_hendrix/uebungen_SE2_hendrix/u21"+File.separator+"dirForQuadrats222";  useless: after initialising

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

        // String filePath = path+"/hierNichtDuLutscher"+File.separator+"quadratzahlen.dat";
        String filePath = path+File.separator+"quadratzahlen.dat";

        

        RandomAccessFile quadratsFile;
        // if (quadratsFile.exists())
        // quadratsFile.delete();
        try {
            // Create + Write Quadrat numbers
            quadratsFile = new RandomAccessFile(filePath, "rw");

            String quad;
            for(int i = 1; i<= 1000; i++){
                quad = Integer.toString(i);
                while (quad.length()<4){
                    quad = " "+quad;
                }
                quadratsFile.writeBytes("Quadrat von\t" + quad + " = "+ i*i +"\n");
            }
            // Ausgabe in der Console: quick and not dirty
            // quadratsFile.seek(0); // an den Dateianfang

            // for (int i = 1; i <=1000; i++) { // 3 Zeilen lesen
            //     System.out.println(quadratsFile.readLine());
            // }
               
            quadratsFile.close();
        }
        catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        }
        catch (IOException io) {
            System.out.println(io.getMessage());
        }





        //Read Quadrats numbers to StringBuffer br with new File

        RandomAccessFile quadratFileRead;
        StringBuffer quadratsBuffer = new StringBuffer();
        try {
            quadratFileRead = new RandomAccessFile(filePath, "r");
            quadratFileRead.seek(0); // an den Dateianfang

            // 1000 Zeilen vom file ausgeben
            for (int i = 1; i < 1000; i++) { // 3 Zeilen lesen
                quadratsBuffer.append(quadratFileRead.readLine());
                quadratsBuffer.append("\n");
            }

            //Test: Lese Zeile 100 aus (Quadratzahl von 100)
            // quadratFileRead.seek(0); 
            // while(quadratFileRead.hasNext())
            // System.out.println("Test Zeile"+ quadratFileRead.readLine());
            quadratFileRead.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // print quadrats in one output
        System.out.println(quadratsBuffer.toString());
    }
}
