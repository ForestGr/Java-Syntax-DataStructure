package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Source: https://www.callicoder.com/java-arraylist/
 */
public class Sort {

  public static void main(String[] args) {
    /**
     * 1. Sort an ArrayList using Collections.sort() method
     */
    List<String> names = new ArrayList<>();
    names.add("Lisa");
    names.add("Jennifer");
    names.add("Mark");
    names.add("David");

    System.out.println("Before : " + names);

    // using Collections.sort() method
    Collections.sort(names);

    System.out.println("After : " + names);

    /**
     * 2. Sort an ArrayList using ArrayList.sort() method: must pass a Comparator
     */
    List<String> names2 = Arrays.asList("Molly", "Ally","Wendy", "Betty");

    // using its sort() method, must pass a Comparator to the ArrayList.sort() method.
    names2.sort(new Comparator<String>() {
      @Override
      public int compare(String name1, String name2) {
        return name1.compareTo(name2);
      }
    });

    // The above `sort()` method call can also be written simply using lambda expression
    names2.sort((name1, name2) -> name1.compareTo(name2));

    // Following is an even more concise solution
    names2.sort(Comparator.naturalOrder());

    System.out.println("Sorted Names : " + names2);
  }

  /**
   * 3. Sort an ArrayList of Objects using custom Comparator: see UserDefinedObject class
   */
}
