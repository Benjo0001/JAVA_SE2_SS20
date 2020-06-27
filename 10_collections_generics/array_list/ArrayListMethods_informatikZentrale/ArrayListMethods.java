/**
 * 
 * https://www.youtube.com/watch?v=d3QbptJRln4  -   Jakob Jenkov
 * 
 * https://www.youtube.com/watch?v=zotAs4v9jH4     - InformatikZentrale
 * 
 * Listen - Eigenschaften
 * - geordnete Elemente
 * - Elemente können mehrfach auftreten
 * 
 */
import java.util.ArrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> friendsList = new ArrayList<>();

        // Element einfügen, an letzter Stelle
        friendsList.add("Peter");
        friendsList.add("Klausi");
        friendsList.add("Jochen");

        // Element "dazwischen" einfügen auf Index-Stelle
        friendsList.add(1, "Heinrich");

        // Elemente ändern
        friendsList.set(0, "Pete");

        //Elemente entfernen
        friendsList.remove("Klausi");   // mit Wert
        friendsList.remove(0);          // mit Index


    
        //Elemente ausgeben an Index-Stelle
        String var = friendsList.get(0);
        
        System.out.println(friendsList);
        

        ArrayList<Integer> plz = new ArrayList<>();
        plz.add(15745);
        plz.add(10178);
        plz.add(10777);

        ArrayList<String> place = new ArrayList<>();
        place.add("Wildau");
        place.add("Berlin-Mitte");
        place.add("Berlin-Schöneberg");

        // Alle Orte ausgeben
        for (String p : place) {
            System.out.println(p);
        }
        
        // Alle Orte mit PLZ ausgeben:
        for (int i = 0; i < place.size(); i++) {
            System.out.println(plz.get(i) + "\t"+ place.get(i));
            
        }

        ArrayList<Integer> testInt = new ArrayList<>();
        testInt.add(12);
        testInt.add(3);
        testInt.add(4);
        testInt.add(1);
        testInt.remove(1);                  // removes the value called by index
        testInt.remove( (Integer)(1));      // removes the value called by the value
        
        System.out.println(testInt);

        
        // unspezific list -> all types are allowed: no good style for programming, but possible
        List myList = new ArrayList();
        myList.add("Test");
        myList.add(1);
        myList.add(2);
        myList.add(3);
        //typecasting needed if copy / modify (because ArrayList has no spezific Object type)
        String var2 = (String)(myList.get(0));
        System.out.println(myList);
    }


}