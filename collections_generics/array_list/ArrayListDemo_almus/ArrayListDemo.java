import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        MyArrayListDemoClass listClass = new MyArrayListDemoClass();
        
        listClass.addItemToMyList("Guten");
        listClass.addItemToMyList("Morgen");
        listClass.addItemToMyList("Tutorium");

        listClass.printMyListItems();

        // Frage: Was passiert hier?
        listClass.addItemToMyList(null);
        
        try
        {
            listClass.addItemToMyList("");
        }
        catch (RuntimeException rtex)
        {
            System.out.println("Beim hinzufuegen des Elements ist ein Fehler aufgetreten! Fehlerfall: Leeres Element uebergeben.");
        }

        if (listClass.removeItemFromMyList("Tutorium"))
        {
            System.out.println("Element wurde gelöscht!");
        }
        else
        {
            System.out.println("Element wurde nicht gefunden oder es ist ein Fehler aufgetreten.");
        }

        if (listClass.removeItemFromMyList("Tutorium 2020"))
        {
            System.out.println("Element wurde gelöscht!");
        }
        else
        {
            System.out.println("Element wurde nicht gefunden oder es ist ein Fehler aufgetreten.");
        }

        listClass.printMyListItems();

        System.out.println("Ende des Programms erreicht.");
    }
}