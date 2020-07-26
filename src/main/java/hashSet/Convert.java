package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class Convert {
  public static void main(String[] args) {

    /**
     * 1. Convert set to List/ArrayList
     */
    // Create a HashSet
    HashSet<String> hset = new HashSet<>();
    hset.add("Steve");
    hset.add("Matt");
    hset.add("John");
    hset.add("Tommy");
    System.out.println("HashSet contains: " + hset);

    //Creating a List of HashSet elements
    List<String> list = new ArrayList<String>(hset);
    System.out.println("ArrayList contains: " + list);

    /**
     * 2. Convert set to a TreeSet
     */
    // Creating an Array
    String[] arr = new String[hset.size()];
    hset.toArray(arr);
    System.out.print("Array elements: " + Arrays.toString(arr));


    /**
     * 3. Convert set to a TreeSet
     */
    //create a TreeSet
    Set<String> tset = new TreeSet<String>(hset);
    System.out.print("\nTreeSet contains: " + tset); //in natural order
  }
}