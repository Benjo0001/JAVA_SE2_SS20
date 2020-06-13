
/**
 * what is Random Access File?
 * File where you can at any time jump to a position of choice
 * and start read or write from the position you jump to
 * 
 * 
 * each character is a byte
 * each new line is 2 bytes
 * 
 * PROs:
 *      really good for performance
 * CONS:
 *      only works if the records are sized in length
 *      (you need to know when you can jump and when not)
 * 
 * 
 * 
 * 
 * https://www.youtube.com/watch?v=dPFbwLwliB8
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * @author benjamin hoppe
 */

public class RandomAccessFile_test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String filepath = "test.dat";
        String delimiter = "///!///";
        
        String dialog = readRandomAcessFile(filepath, 2, 4, 26, delimiter);
        System.out.println(dialog);

        
    }
}