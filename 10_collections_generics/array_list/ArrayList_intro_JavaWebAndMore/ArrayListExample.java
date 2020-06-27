/**
 * ArrayList: ist eine Liste in der Daten gespeichert werden können
 * ArrayList ist generisch: Sie kann nach Angabe verschiedene Datentypen speichern -> ArrayList<String> ArrayList<Double>
 */
import java.util.ArrayList;

public class ArrayListExample {
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Klausi");
        name.add("Michael");
        name.add("Nele");
        name.add("Günter");
        //... keine Beschränkung
        
        name.remove("Klausi");

        System.out.println(name.size());
        
        //print out
        for(String vorname : name){
            System.out.println(vorname);
        }



        ArrayList<Double> grades = new ArrayList<>();
        grades.add(1.0);
        grades.add(4.0);
        grades.add(1.7);
        grades.add(1.3);
        grades.add(1.7);

        grades.set(1, 0.7);
        grades.remove(1.7); // removes all values with 1.7
        grades.remove(3);

        System.out.println("Grades: ");
        double sum=0;
        for (Double grade : grades) {
            sum += grade;
            System.out.print(grade+" ");
        }
        System.out.println("Mittelwert: " + (sum/grades.size()));
        


        ArrayList<Integer> intValues = new ArrayList<>();
        intValues.add(1);
        intValues.add(20);
        intValues.add(30);
        intValues.add(4);
        intValues.add(5);
        
        System.out.println("intValues: ");
        for (Integer v : intValues) {
            System.out.print(v+" ");
        }
        intValues.remove(1);            //remove Item with (int) index 1
        intValues.remove((Integer)30);  //remove explizit value

        System.out.println("\nintValues after remove: ");
        for (Integer v : intValues) {
            System.out.print(v+" ");
        }


    }
}