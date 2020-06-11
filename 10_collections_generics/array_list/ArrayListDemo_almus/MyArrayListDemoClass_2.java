import java.util.*;

public class MyArrayListDemoClass {
    private ArrayList<String> myList;

    public MyArrayListDemoClass() {
        // Wenn Größe bekannt, dann Konstruktor mit parameter für initiale Größe verwenden.
        this.myList = new ArrayList<>(1000);
    }

    public boolean addItemToMyList(String item) {
        if (item == null)
        {
            System.out.println("Fehler: item ist null!");
            return false;
        }

        if (item.length() == 0)
        {
            // die ebenfalls mögliche Variante mit einer RuntimeException
            throw new RuntimeException("Fehler: item ist ein leerer String!");
        }

        return this.myList.add(item);
    }

    // new function 
    public boolean removeItemFromMyList(Integer item)
    {
        // if (item == null)
        // {
        //     System.out.println("Fehler: item ist null!");
        //     return false;
        // }

        // if (item.length() == 0)
        // {
        //     // die ebenfalls mögliche Variante mit einer RuntimeException
        //     throw new RuntimeException("Fehler: item ist ein leerer String!");
        // }

        // boolean result = false;
        // ListIterator<String> listIterator = this.myList.listIterator();
        // while (listIterator.hasNext()) {
        //     String element = listIterator.next();

        //     // Pruefung notwendig, fall "null" zugelassen ist als element
        //     if (element != null)
        //     {
        //         if (element.equals(item))
        //         {
        //             listIterator.remove();
        //             result = true;
        //         }
        //     }
        // }
        
        // Unterschied ob ein int oder ein Integer Object übergeben wird
        // beim Übergeben von int wird der Wert an der (item). Stelle gelöscht
        // beim übergeben von Integer werden die Objecte verglichen und das Object mit dem Wert vom übergebenen Integer gelöscht
        return this.myList.remove(item);
    }

    public void printMyListItems() {
        System.out.println("Elemente in der Liste:");
        for (String string : myList) {
            System.out.println(string);
        }
    }
}