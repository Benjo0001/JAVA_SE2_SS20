/**
 * BufferedReader_mcProgramming
 * 
 * 
 * Input String Reader -> Safer and more effizient way
 * 
 * https://www.youtube.com/watch?v=waXvGUEjTTs Java - I/O - BufferedReader
 * 
 **/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_mcProgramming {

    public static void main(String[] args) {
        BufferedReader br = null;

        String line;

        // FileReader fr;
        // try {
        //     fr = new FileReader("/Users/ben/Documents/02_Java/JAVA_SE2_SS20/read_data_file/data_to_read_n_write/allesNeu.txt");
            
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        // br = new BufferedReader(fr);

        FileReader fr;
        try {
            br = new BufferedReader(new FileReader("/Users/ben/Documents/02_Java/JAVA_SE2_SS20/read_data_file/data_to_read_n_write/allesNeu.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        // } catch (FileNotFoundException e) {   IOException kann beide (auch die Fehlerbehandlung für Buffered reader) übernehmen und ersetzt daher die FileNotFound
        } catch (IOException e) {
            e.printStackTrace();
        }

       

    }
}