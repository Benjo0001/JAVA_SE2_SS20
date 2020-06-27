/**
 * 
 * SET
 * the Java Set interface represents an unordered collection of unique elements
 * == no garantie for order of elements
 * == no element added more than once
 * 
 * 
 * https://www.youtube.com/watch?v=rruCajMgvGA      -   Jakob Jenkov
 */

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

import java.util.Iterator;
import java.util.stream.*;

import java.util.ArrayList;
import java.util.*;

public class SetExample {
    // Sets store unique values

    
    public static void main(String[] args) {
        
        // Set is Interface -> can not be instanciated directly
        Set<String> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        // same as HashMap / HashTree -> only difference TreeSet orders it elements internally
        
        // add elements -> boolean (added / not added)
        boolean added = set1.add("Hello");
        System.out.println(added);
        System.out.println(set1.add("Hi"));
        System.out.println(set1.add("Hello"));
        set1.add("Uhu");

        // remove elements -> boolean (removed / not removed)
        System.out.println("removed element hi? "+ set1.remove("Hi"));
        System.out.println("removed element moin? "+ set1.remove("moin"));

        // remove all
        // set1.clear();
        
        // add total set
        set1.addAll( Set.of("1", "Hello", "Dude", "moin"));  // duplicate entrys are skipped
        System.out.println(set1);

        //remove a total set of values
        set1.removeAll( Set.of("1", "Dude"));
        System.out.println(set1);

        // only keep element which is in set and the checked set
        set1.retainAll( Set.of("moin", "Aloha", "Servu"));  //only moin will be left
        System.out.println(set1);

        // more methods
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());
        System.out.println(set1.contains("moin"));


        // create set when initialising
        System.out.println("-- -- -- --");
        Set<Integer> set3 = Set.of(19, 6, 4, 7, 30, 22); // creates HashSet
        System.out.println(set3.size());
        System.out.println(set3.contains(7));

        Set<Integer> set4 = new TreeSet<>();
        set4.add(19);
        set4.add(6);
        set4.add(4);
        set4.add(7);
        set4.add(30);
        set4.add(22);
        set4.add(7);


        // iterate throw set

        // 1st: classic iterator
        System.out.println("\n-- -- -- --");
        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next +" ");
        }

        // 2nd: for each
        // forEach - HashSet -> not ordered
        System.out.println("\n-- -- -- --");
        for(Integer num: set3){
            System.out.print(num+" ");
        }

        System.out.println("\n-- -- -- --");

        // forEach - TreeSet -> ordered
        for(Integer num: set4){
            System.out.print(num+" ");
        }
        
        System.out.println("\n-- -- -- --");

        // 3rd output: stream
        Stream<Integer> stream = set4.stream();
        stream.forEach((element)-> {System.out.print(element+ " "); });

        System.out.println("\n-- -- -- --");

        
        // convert Set to List:
        List<String> list = new ArrayList<>();
        list.addAll(set1);
        System.out.println(list);
    }

} 