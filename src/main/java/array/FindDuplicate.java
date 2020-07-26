package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicate {

  public static void main(String args[]) {

    String[] names = {"Julia", "Roberts", "Tan", "C", "Ruby", "Julia"};

    // First solution : finding duplicates using brute force method
    System.out.println("m1: brute force method");
    for (int i = 0; i < names.length; i++) {
      for (int j = i + 1; j < names.length; j++) {
        if (names[i].equals(names[j])) {
          System.out.println("found a duplicate element in array : " + names[i]);
        }
      }
    }
    // Second solution : use HashSet data structure
    System.out.println("m2: using HashSet");
    Set<String> store = new HashSet<>();
    for (String name : names) {
      if (store.add(name) == false) {
        System.out.println("found a duplicate element in array : " + name);
      }
    }
    // Third solution : using Hash table (map & set) data structure
    System.out.println("m3: using hash table");
    Map<String, Integer> nameAndCount = new HashMap<>();
    // build hash table with count
    for (String name : names) {
      Integer cnt = nameAndCount.get(name);
      if (cnt == null) {
        nameAndCount.put(name, 1);
      } else {
        nameAndCount.put(name, cnt++);
      }
    }
    // Print duplicate elements from array in Java
    Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
    for (Entry<String, Integer> entry : entrySet) {
      if (entry.getValue() > 1) {
        System.out.println("Duplicate element from array : " + entry.getKey());
      }
    }
    //System.out.println("No duplicate element found from array");
  }
}

