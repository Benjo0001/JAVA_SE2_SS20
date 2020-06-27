/**
 * 
 * 
 * https://www.youtube.com/watch?v=UfBaTKaSSRg  - Jakob Jenkov
 * 
Since Map is an interface you need to instantiate a concrete implementation of the Map interface in order to use it. The Java Collections API contains the following Map implementations:

java.util.HashMap
java.util.Hashtable
java.util.EnumMap
java.util.IdentityHashMap
java.util.LinkedHashMap
java.util.Properties
java.util.TreeMap
java.util.WeakHashMap

 */


import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class MapIntro {
    public static void main(String[] args) {


        // Map is an interface -> must create an instance of map that implements the interface map
        Map<String, String> stringMap = new HashMap<>();

        // most common:
            // HashMap
                // maps a key and a value. It does not guarantee any order of the elements stored internally in the map.
                // typically the fastest of the two Map implementations
                Map mapA = new HashMap();

            // TreeMap 
                // also maps a key and a value. Furthermore it guarantees the order in which keys or values are iterated - 
                // which is the sort order of the keys or values. Check out the Java Map JavaDoc for more details.
                Map mapB = new TreeMap();

                
        Map<String, Integer> newMap = new HashMap<>();
  
  
        // //bad style example: without declaration possible -> "Java Compiler: unsafe operations"
        // Map map = new HashMap();
        // //now all types are allowed
        // map.put(123, "String");
        // map.put("123", 789); 
        // map.put("abc", Integer.valueOf(123));


        Map<String, Integer> map = new HashMap<>();

        // inputs must allways be Object, otherwise they will be converted behind the scenes from Java
        map.put("def", 456); // 456 is converted to new Integer()

        // if adding duplicate entrys: second value of pair two replaces the one of pair one
        map.put("abc", Integer.valueOf(111));

        // null is possible
        map.put("ddd", null);
        map.put(null, 999);
        System.out.println(map.get(null));
        // 7:10

        // copy a map
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        //map2.put("String", 1);
        System.out.println(map2.size());
        System.out.println(map2.get("def"));
        System.out.println(map2);
        //check if empty
        System.out.println(map.size()==0);
        System.out.println(map.isEmpty());

        // equals method is implemented already
        System.out.println("map Equals map2 ? "+ map.equals(map2));




        Map<Integer, String> names = new HashMap<>();
        names.put(8, "Jane");
        names.put(6, "Nele");
        names.put(4, "Peter");
        names.put(5, "Jan");

        // map contains value?
        System.out.println(names.containsValue("Jane"));
        System.out.println(names.containsValue("jane"));
        System.out.println(names.containsValue("Jakob"));

        System.out.println(names.get(7));

        //get a value for not existing entry
        System.out.println(names.get(8));


        // delete all elements
        // map2.clear();
        // System.out.println(map2.size());

        // replace a value - olf value is returned 
        String oldValue = names.replace(7, "Ben");
        System.out.println("old value "+oldValue);
        System.out.println("new value "+names.get(7));
       

        // iterate through map

        // 1st way: standart iterator
        System.out.println("\n-------------------------\n");
        Iterator<Integer> keyIterator = names.keySet().iterator();
        while(keyIterator.hasNext()){
            Integer nextKey = keyIterator.next();
            System.out.print(nextKey+" ");
            System.out.println(names.get(nextKey));
        }

        // 2nd way: for each
        System.out.println("\n-------------------------\n");
        for(Integer key : names.keySet()){
            System.out.print(key+" ");
            System.out.println(names.get(key)+" ");
        }

        // 3rd way: stream
        // entrySet of the map, lambda expression
        System.out.println("\n-------------------------\n");
        names.entrySet().forEach((Map.Entry<Integer, String> entry)->{
            System.out.print(entry.getKey()+" ");
            System.out.println(entry.getValue());
        });

        // Difference HashMap & TreeMap
        /**
        
        HashMap
            uses hashTable to store key value pairs
            very fast look up into
            can not garantie the order of value pairs

        TreeMap
            orders in alphabetical order (default)
         */


    }
}