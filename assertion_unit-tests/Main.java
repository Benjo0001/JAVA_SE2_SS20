/**
 * Main
 */
public class Main {

    /**
     * Die Seitenzahl
     */
    int pages = 42;
    
    /**
     * @param args Der Paramezer, den der Benutzer angibt, wenn er dass Programm startet
     */
    public static void main(String[] args) {
        int i=0;
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        ProgramClass t = null;

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            t = new ProgramClass();
        }
    }
}