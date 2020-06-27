/**
 * Generische Datentypen ermöglichen es eine Klasse mit verschiedene Datentypen arbeiten zu lassen
 * je nachdem mit welchen man sie aufrufen möchte
 * 
 * https://www.youtube.com/watch?v=2V8Hjq6IfXA    - DeBukkIt
 */


public class GenericTypes {
    public static void main(String[] args) {

        // aber wie ist es wenn wir dort jetzt einen String drin speichern wollen
        // StorageClass memory = new StorageClass(127);
        // memory.setStorage(1527);
        // System.out.println(memory.getStorage());

        //StorageClass<String, Double> memory = new StorageClass<String, Double>("Hello you beautyful world!", 17.0, 2);
        // vereinfachte Schreibweise mit "Diamant Interferenz-Operator": der sagt einfach "Compiler sei nicht so blöd, guck einfach was vorne steht"
        StorageClass<String, Double> memory = new StorageClass<>("Hello you beautiful world!", 17.0, 2);
        memory.setStorage("Nice Day");
        System.out.println(memory.getStorage() + " "+ (memory.getStorage2() +4.8) + " "+ memory.getZahl());
        

        // Anwendung in der Praxis: z.b. ArrayList
        // ArrayList<String> list = new ArrayList<String>();
        // list.add("TestString");
    }
}