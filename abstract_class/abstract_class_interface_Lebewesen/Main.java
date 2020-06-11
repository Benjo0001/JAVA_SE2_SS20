/**
 * Test of Interface Lebewesen
 * 
 */

class Main {
    public static void main(String[] args) {
        System.out.println("\n");

        Tier t = new Hund();

        // Tier t casten zu einem Hund... erhält dann auch Methoden die ein Hund hat
        // nur machen wenn man sicher weiß als welches Objekt es erstellt wurde!
        Hund h = (Hund)t; //Achtung geht nur wenn man es als neuen Hund erstellt hat (= new Hund())
        t.atme();
        System.out.println(t.macheDichBemerkbar());

        // Zeilenabstand
        System.out.println("\n");
    
        // Interfaces kann man nicht instanzieren!
        // Lebewesen l = new Lebewesen(); geht NICHT!!!

        // erstelle neues Lebewesen vom Typ Fisch 
        Lebewesen l = new Fisch();
        l.atme();

        // Array mit mehreren Lebewesen
        Lebewesen[] ls = new Lebewesen[10];
        for(int i = 0; i < 10; i++){

            ls[i] = new Fisch();
            ls[i].atme();
        }
        System.out.println("_____________________abstract class for the win___________");
        
        ls[5] = new Hund();
        // ls[4] = new Tier(); geht nicht mehr
        ls[4] = new Hund();



        // Ausgabe atme
        for(int i = 0; i < 10; i++){
            ls[i].atme();
        }

    }
}