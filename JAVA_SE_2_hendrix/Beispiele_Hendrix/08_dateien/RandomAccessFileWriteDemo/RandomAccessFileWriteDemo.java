/**
 * Tutorial write on spezific position
 * 
 * 
 * https://www.youtube.com/watch?v=2xzXz6965RA      Ram N Java Tutorial
 */
// import java.io.IOException;
import java.io.*;

public class RandomAccessFileWriteDemo {
    public static void main(String[] args) throws IOException
    {
    
        RandomAccessFile randomAcessFile_1 = null;

        String filename = "rsc/file.txt";
        String text = "Ich verbrenn\" mein Studio, schnupfe die Asche wie Koks********\nIch erschlag\" meinen Goldfisch, vergrab\" ihn im Hof\nIch jag\" meine Bude hoch, alles was ich hab\", lass ich los (uh!)\n";
        try {
            randomAcessFile_1 = new RandomAccessFile(filename, "rw");
            
            //write some Text into file            
            randomAcessFile_1.write(text.getBytes());


            /**
             * .seek(43) Set the file-pointer offset, mesured from 
             * the beginning of this file at which the next
             * read or write occurs
             */
            randomAcessFile_1.seek(50);
            //overrides the bytes length given by function write()
            //randomAcessFile_1.write("Puderzucker".getBytes());
            // gleiches ergebnis
            randomAcessFile_1.writeBytes("Puderzucker");

            //recommended by Hendrix but not nice -> \n does not work for it
            //randomAcessFile_1.writeUTF("Puderzucker");


            // add content in the end
            randomAcessFile_1.seek(randomAcessFile_1.length());
            randomAcessFile_1.writeBytes("--------\n");
            randomAcessFile_1.seek(randomAcessFile_1.length());
            randomAcessFile_1.writeBytes("Successfully updated the file content.");


            System.out.println("Successfully updated the file content..");
        } catch (Exception e) {
            System.out.println("Fehler beim Schreiben der Datei "+ filename);
        } finally{
            if(randomAcessFile_1 != null)
                randomAcessFile_1.close();
        }
    }

}