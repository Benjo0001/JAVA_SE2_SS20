/**
 * Generic data types
 * 
 * https://www.youtube.com/watch?v=uLSiFW18OhE  - Morpheus Tutorial
 */
import java.util.ArrayList;

public class Gen<T extends Tier> {
    // ArrayList<String> stringVar = new ArrayList<String>();
    // ArrayList<int> intValues = new ArrayList<>();   // <> kann seid bestimmter Java Version auch leer gelassen werden, java nutzt dann den Wert aus ersten <int>

    private T value;
    private T next;
    private T before;

    public String getTName(){
        return ((Tier)value).getName(); // hier könnte man jetzt zu Tier casten (muss gemacht werden für Compiler) und könnte dann funktionen von Tier nutzen 
    }
    public T getT(){
        return this.value;
    }
}