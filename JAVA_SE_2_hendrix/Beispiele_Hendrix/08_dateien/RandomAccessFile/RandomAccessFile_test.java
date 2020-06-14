
/**
 * what is Random Access File?
 * File where you can at any time jump to a position of choice
 * and start read or write from the position you jump to
 * 
 * * ADVANCED/Effektive way of using RandomeAcessFile 
 * 
 * each character is a byte
 * each new line is 2 bytes
 * 
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
import java.util.Random;

/**
 * @author benjamin hoppe
 */

public class RandomAccessFile_test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String filepath = "test.dat";
        String delimiter = "///!///";   //split out each record we read, when return it out of the methods
        
        /** 
         * inputs in readRandomAcessFile(filepath, 2, 4, 26, delimiter)
        
        filepath - path where the file is stored
        2 - line of file where start read from
        4 - last line where we wish to read from
        26 - length of our fixed record (length of the line)
        */
        String dialog = readRandomAccessFile(filepath, 2, 4, 26, delimiter);
        System.out.println(dialog);


    }

    public static String readRandomAccessFile(String filepath, int lineStart, int LineEnd, int charsPerLine)
    {
        File file = new File(filepath);
        String data = "";
        ArrayList<String> dialogLinesRead = new ArrayLIst<>();
        int bytesPerLine = charsPerLine+2;

        try {
            RandomAccessFile randomAccessFile_1 = new RandomAccessFile(file, "rw");

            // READING DATA each line with is given in method
            for (int i = lineStart; i < lineEnd; i++) 
            {
                randomAccessFile_1.seek(bytesPerLine*i);
                data = randomAccessFile_1.readLine();
                dialogLinesRead.add(data);
            }

        // closing file
        randomAccessFile_1.close();

        } catch (Exception e) {
            System.out.println("Error occured");
        }


        // for testing: return String of all output data
        StringBuffer returnData = new StringBuffer();
        for (int i = 0; i< dialogLinesRead.size(); i++){
            returnData += dialogLinesRead.get(i);
            returnData += delimiter;
        }
        if(dialogLinesRead.isEmpty())
        {
            data = "No lines found";
        }
        return returnData.toString();

    }
}