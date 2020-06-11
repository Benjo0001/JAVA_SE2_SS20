/**
 * https://www.youtube.com/watch?v=lHFlAYaNfdo
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WriteFile {
    public static void main(String[] args) throws IOException{
        
        // Setup for writing the text
        File allesNeu = new File("/Users/ben/Documents/02_Java/JAVA_SE2_SS20/read_data_file/data_to_read_n_write/allesNeu.txt");
        Scanner scan = new Scanner(allesNeu);        
        String fileContent = "This is a new File created by Java\n";
        while(scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        // WRITE FILE
        FileWriter writer = new FileWriter("/Users/ben/Documents/02_Java/JAVA_SE2_SS20/read_data_file/data_to_read_n_write/writtenFiles/firstWrite_alexLee.txt");
        writer.write(fileContent);
        writer.close();
    }
}