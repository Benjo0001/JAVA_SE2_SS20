/**
 * Datenstrukturen der JWM (von Oracle)
 * 
 * auch ein Generic wie die Liste (daher auch die < > Klammern)

 * Tutorial: https://www.youtube.com/watch?v=sBddaaWhbOU
 * 
 */
import java.util.HashSet;

public class HashSet_morpheus {
    public static void main(String[] args) {
       HashSet<String> h = new HashSet<String>(); 
       
       // Elemente werden möglichst effizient eingetragen, ungeordnet
       h.add("Hallo");
       h.add("Hallo");
       System.out.println(h.size());
    }
}