// In this code Sets, Lists, Maps, HashMaps etc are discussed.
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Set is an unordered collection of unique elements
        //HashSet
        Set<Integer> t = new HashSet<Integer>();
        t.add(5); // add elements to set
        t.add(7);
        t.add(6);
        t.add(5); // since duplicate element is added this add statement will not have any affect.
        boolean x = t.contains(5); // Check we have the element 5
        t.remove(9); // To remove elements in a set
        t.isEmpty(); // To check if the set is empty
        t.size(); // To get the length of the set
        System.out.println(x); // In standard HashSet the elements gets printed in any random order.
    
        // TreeSet
        // TreeSets are ordered, duplicate elements can't be added and no set can be indexed
        Set<Integer> s = new TreeSet<Integer>(); //Ordered Set
        s.add(5); // All other operations are similar to HashSet
        s.add(7);
        s.add(6);
        s.add(5);
        boolean y = s.contains(5);
        t.remove(9);
        t.isEmpty();
        System.out.println(y);
        // Similar to HashSet and TreeSet we also have LinkedHashSet which is faster in certain operations.


        // Lists - indices can be accessed  and similar to array but slower.
        ArrayList<Integer> t1 = new ArrayList<Integer>();
        t1.add(1);
        t1.add(2);
        t1.add(1);
        t1.add(2);
        t1.add(1);
        t1.add(2);
        t1.get(0); //to get element of index 0
        t1.set(1,5); // change 1st index to value 5
        t1.size(); // To get the lists size
        t1.subList(1, 3); // Get elements from 1st index to 3rd, excluding 3rd.

        System.out.println(t1.subList(1, 4));
        // Similarly we have LinkedList which is faster on certain operations but has similar functionalities
        // Set is used when we dont care about the order and indices , but just the unique elements there. It is a lot faster than Lists in that case.


        // Maps 
        // They are typical Key-value pairs
        // Maps like sets are fast and have a constant time of execution.
        Map m = new HashMap(); //In HashMap there can't be two same keys, the later will be overwritten
        m.put("tim",5); //add Key and Value, key can be of any datatype
        m.put("joe","Bill"); //Key and Values in one Map can be of variety datatypes
        m.put("jim",1); // Maps are unordered and can only contain unique keys, duplicate keys are overwritten
        System.out.println(m.get("tim")); // To get the value of the key tim

        // TreeMap
        // In a TreeMap everything is similar to Hashmap, except it follows an order of
        // containing the key-value pairs and the keys should have the same datatype.
        
        // LinkedHashMap
        // In a LinkedHashMap , the order of elements will be according to our element addition order.

        // Useful operations with Maps
        m.containsValue("b"); // Checks if this value exists
        m.containsKey(5); // Check if this key exists and return null id key doesnot exists.
        m.values(); // Prints all values in the map
        m.clear(); // Removes Everyting from Map
        m.isEmpty(); // Checks if the map is empty
        System.out.println(m);

    }
}