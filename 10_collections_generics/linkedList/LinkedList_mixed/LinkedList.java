/**
 * 
 * LinkedList - Characteristic
 * can contain any type of data
 * each element links to its next
 * sorted or unsorted
 * can contain duplicates
 * Elements are not indexed 
 * -> get an item by referencing through hole LinkedList start with head (first item last added)
 * 
 * + insertion & deletion is very quick (on the beginning == prepend)   -> O(1)
 * - cons: slow to get k-th element (iterate through list)              -> O(n)
 * - insert at the end - append is slow                                 -> O(n)
 * 
 * perfect explanation:
 * https://www.youtube.com/watch?v=QWMyhFUtFHo  -   Telusko
 * 
 * https://www.youtube.com/watch?v=njTh_OwMljA
 */
import static java.lang.System.*;

import java.util.ArrayList;
import java.util.ListIterator;

public class LinkedList {
    //everything as arrayList

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(10);
        list.add(22);
        list.add(99);

        // ListIterator iterate through list
        ListIterator li = list.listIterator();
        out.println("ListIterator output:");
        while (li.hasNext()) {
            out.print(li.next()+" ");
        }
    }

    // list iterator
    // https://www.youtube.com/watch?v=quRRkdsY13U
}