/** 
 * Generische "Maps" zum Speichern von "Objekt-Paaren"
 * Schlüssel mit dazugehörigen Werten
 * 
 HashMap<String, String> m = new HashMap<String, String>();
 *
 * 
 * BSP: Mehrsprachigkeit -> Bezeichnung zeigt auf language path
 *    
 *                       dieser kann hier in verschiedenen Sprachen angepasst werden
 * Tutorial: JavaWebAndMore
 * https://www.youtube.com/watch?v=XnPTJIQhsiY
 */
import java.util.*;

public class HashMap_jwm {
     // "aktuell gesetztes" dictionary
     static HashMap<String, String> dict;
     static HashMap<Integer, String> greeting;


    public static void main(String[] args) {
        
        System.out.println("\n\n");
        
        //example: multi language gamge

        HashMap<String, String> deutsch = new HashMap<String, String>();
        deutsch.put("mmenu", "Hauptmenü");
        deutsch.put("sstart", "1) Spiel Starten");
        deutsch.put("exit", "Beenden");
        deutsch.put("exit", "Beenden2");     // mehrfach Hinzufügen erzeugt keinen Fehler, es überschreibt in dem Fall einfach das vorhandene Object

        HashMap<String, String> english = new HashMap<String, String>();
        english.put("mmenu", "Main Menu");
        english.put("sstart", "1) Start game");
        english.put("exit", "Exit");

        dict = english;
        System.out.println(dict.get("mmenu"));
        System.out.println(dict.get("sstart"));
        System.out.println(dict.get("exit"));

        dict = deutsch;
        System.out.println(dict.get("mmenu"));
        System.out.println(dict.get("sstart"));
        System.out.println(dict.get("exit"));

        System.out.println("\n\n");




        // Version 2 mit unterschiedlichen Datentypen
        
        // english language hashmap
        HashMap<Integer, String> greeting_eng = new HashMap<Integer, String>();
        greeting_eng.put(1, "Hello Dude");
        greeting_eng.put(2, "Hello Sir");
        greeting_eng.put(3, "Hello Mrs");
        
        // german language hashmap
        HashMap<Integer, String> greeting_de = new HashMap<Integer, String>();
        greeting_de.put(1, "Guten Tag");
        greeting_de.put(2, "Hallo");

        greeting = greeting_eng;
        System.out.println(greeting.get(1));
        System.out.println(greeting.get(2));
    
        greeting = greeting_de;
        System.out.println(greeting.get(1));
    }
}