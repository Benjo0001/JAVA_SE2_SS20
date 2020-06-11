public class StringBuffer_telusko {
    public static void main(String[] args) {

        String s = "Hello Buffer";

        // leeren StringBuffer erstellen
        // StringBuffer sbf = new StringBuffer();
        
        // StringBuffer mit Werten erstellen
        StringBuffer sbf = new StringBuffer("This is a new StringBuffer");
        sbf.append("String Buffer is cool\n");
        sbf.append(s);
        sbf.insert(4, "//InsertTest//");
        sbf.replace(10, 18, "//ReplaceTest//");
        sbf.delete(0, 2);

        // System.out.println(sbf.toString());
        System.out.println(sbf);  // automatically converts to String

    }
    
}