import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

import java.io.*;
/**
 * Tutorial einfaches Nutzen von File und RandomAccessFile
 * 
 * https://www.youtube.com/watch?v=eimdOZs9vi4  TutorialBull
 */

public class DateiLesenSchreiben {
    public static void main(String[] args) {
        String satz = "";
        System.out.println("satzt: "+satz);

        try{
            // in File schreiben (und anlegen falls noch nicht vorhanden)
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            file.writeBytes("Hallo, meine erste Datei\n");
            file.writeBytes("Hallo, meine zweite Zeile");
            file.close();

            // file auslesen
            RandomAccessFile rfile = new RandomAccessFile("test.txt", "r");
            satz = rfile.readLine();
            rfile.seek(satz.length()+1);
            satz = satz+ "\n" + rfile.readLine();
            rfile.close();
            
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException ee)
        {
            ee.printStackTrace();
        }
        System.out.println("satz: "+ satz);


        //file löschen
        File file = new File("test.txt");
        if (file.exists())
            file.delete();
    }

}