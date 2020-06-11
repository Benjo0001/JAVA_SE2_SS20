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

    public boolean removeItemFromMyList(String item)
    {
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

        boolean result = false;
        ListIterator<String> listIterator = this.myList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();

            // Pruefung notwendig, fall "null" zugelassen ist als element
            if (element != null)
            {
                if (element.equals(item))
                {
                    listIterator.remove();
                    result = true;
                }
            }
        }

        return result;
    }

    public void printMyListItems() {
        System.out.println("Elemente in der Liste:");
        for (String string : myList) {
            System.out.println(string);
        }
    }
}