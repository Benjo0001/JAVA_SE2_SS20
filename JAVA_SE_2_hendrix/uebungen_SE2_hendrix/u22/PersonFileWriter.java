import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PersonFileWriter{
    
    public static void writePersonData(PersonData p) throws IOException {
        String path = "personendaten";
        String filename = File.separator+"persons.dat";
        File personDir = new File(path);
        
        if(!(personDir.exists())){
            personDir.mkdir();
        }
        try {
            RandomAccessFile pFile = new RandomAccessFile(path+filename, "rw");
            if(p != null){
                pFile.writeBytes("Name:\t\t"+ p.getName()+"\n");
                pFile.writeBytes("Gender:\t\t"+p.getGender()+"\n");
                pFile.writeBytes("Height:\t\t"+Double.toString(p.getHeigth())+"\n");
            }
            // output on console
            pFile.seek(0);
            
            System.out.println("\nEintrag Datei:");
            for (int i = 0; i < 3; i++) {
                System.out.println(pFile.readLine());       
            }
            System.out.println("\n");
            pFile.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            
        }
    }
}