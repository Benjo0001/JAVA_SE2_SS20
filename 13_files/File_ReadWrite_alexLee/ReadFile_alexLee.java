/**
 1. open file
 2. read first line, second line ... all the way down
 


 * https://www.youtube.com/watch?v=lHFlAYaNfdo
 * 
 */
/**
 * ReadFile_alexLee
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//If you want to pause then use 
import java.util.concurrent.TimeUnit;



public class ReadFile_alexLee {

    public static void main(String[] args) throws FileNotFoundException {
        File allesNeu = new File("/Users/ben/Documents/02_Java/JAVA_SE2_SS20/read_data_file/data_to_read_n_write/allesNeu.txt");
        File allesNeu_html = new File("/Users/ben/Documents/02_Java/JAVA_SE2_SS20/read_data_file/data_to_read_n_write/allesNeu.html");
        // path: /Users/ben/Documents/02_Java/JAVA_SE2_SS20/read_data_file/data_to_read_n_write/allesNeu.txt
        // relative Path: 

        Scanner scan = new Scanner(allesNeu);        
        
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }

    }
}