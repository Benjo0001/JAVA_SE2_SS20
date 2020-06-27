/**
    Übung 17

    Schreiben Sie eine Klasse zum Speichern von Integer-Werten. Zur Speicherung der Werte soll die Klasse als Attribut eine ArrayList besitzen. Ferner soll die Klasse folgende Methoden beinhalten:

    1) Methode zum Speichern eines einzelnen int-Wertes
    2) Methode zum Speichern eines kompletten Arrays mit int-Werten
    3) Methode zum Löschen eines einzelnen int-Wertes
    4) Methode zur Feststellung, ob ein bestimmter int-Wert schon in der ArrayList gespeichert ist
    5) Methode zum aufsteigenden Sortieren der ArrayList   
 * 
 *
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStorage {
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList getArrayList(){
        return list;
    }

    public void addIntValue(int v){
        list.add((Integer)(v));
    }

    public void addIntValue(int v, int index){
        list.add(index, (Integer)(v));
    }

    public void addIntArray(int[] a){
        for (int i : a) {
            list.add(i);
        }
    }

    public void removeIntValue(int v){
        // get the index of the first element that occurs with the given value -> and remove it
        list.remove(list.indexOf((Integer)(v)));
    }

    public boolean containsValue(int v){
        return list.contains((Integer)(v));
    }

    public void sortArrayList(){
        Collections.sort(list);
    }
}