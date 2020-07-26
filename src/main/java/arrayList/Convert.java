package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convert {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Cat");
    list.add("Dog");
    list.add("Bird");
    list.add("Rabbit");
    list.add("Cat");
    System.out.println("Original list:" + list);

    //1. Covert list to set: will remove the duplicate element
    Set<String> set = new HashSet<>();
    set.addAll(list);
    System.out.println("Convert list to set: "+ set);

    //2. Covert list to array: list.toArray()
    Object[] objects1 = list.toArray();
    System.out.println("Convert list to array: "+ Arrays.toString(objects1));
    String[] objects2 = list.toArray(new String[0]);//also ok to convert to an array of a specific type
    System.out.println("Convert list to array of specific type: "+ Arrays.toString(objects2));

    //3. Covert array to list: Arrays.asList()
    String[] values = new String[]{ "one", "two", "three" };
    List<String> valueList = (List<String>) Arrays.asList(values);
    System.out.println("Convert array to list: " + valueList);
  }
}
