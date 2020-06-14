/**
 * 
Übung 20

Einem Programm sollen zwei Parameter übergeben werden. Überprüfen Sie die korrekte Anzahl der Parameter über eine Assertion.

Starten Sie das Programm mit und ohne Verwendung von Assertions.


    RUN with:
        java -ea AssertionsParameterDemo
 */
public class AssertionsParameterDemo {
    public static void main(String[] args) {
        // assert args.length == 2 : "\n\nEs müssen genau 2 Parameter übergeben werden\n";
        assert args.length == 2 : printFail();
        
        System.out.println("\nAll done - keine Asserts\n");
    }

    //test if functions are allowed in assertion output -> yes!
    public static String printFail(){
        System.out.println("ASSERTION!");
        return "Es müssen genau 2 Parameter übergeben werden";
    }
}