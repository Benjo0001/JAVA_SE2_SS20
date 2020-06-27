public class ArrayListTest {
    public static void main(String[] args) {    
        
        ArrayListStorage als = new ArrayListStorage();
        
        // 4) Methode zur Feststellung, ob ein bestimmter int-Wert schon in der ArrayList gespeichert ist
        System.out.println(als.containsValue(10));
        // 1) Methode zum Speichern eines einzelnen int-Wertes
        als.addIntValue(10);
        System.out.println(als.containsValue(10));

        // 2) Methode zum Speichern eines kompletten Arrays mit int-Werten
        int[] arrayI = {12, 4, 6, 1, 2, 4, 19};
        als.addIntArray(arrayI);
        System.out.println(als.getArrayList());
        
        // 3) Methode zum Löschen eines einzelnen int-Wertes
        als.removeIntValue(4);
        System.out.println(als.getArrayList());
        
        // 5) Methode zum aufsteigenden Sortieren der ArrayList   
        als.sortArrayList();
        System.out.println(als.getArrayList());

    }
}