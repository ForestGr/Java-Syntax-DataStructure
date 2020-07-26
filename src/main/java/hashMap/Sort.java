package hashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
* HashMap Class 5
* Sort a hashMap by 1.key,2.value
*/

public class Sort {
  public static void main(String[] args) {
    Map<Integer, String> hashMap = new HashMap<>();
    hashMap.put(10, "Amy");
    hashMap.put(20, "Beth");
    hashMap.put(30, "Annie");
    hashMap.put(40, "Lucy");

    /**
     * HashMap does not preserve any order in its entries.
     * The code below outputs the contents of the map in random order:
     */
    //iterate, can replace by other method in the 'CountryCapital'class section 5
    hashMap.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

    /**
     * 1. Sort a hashMap by key: use TreeMap
     */
    System.out.println("______sort a hashMap by key using TreeMap_______");
    Map<Integer, String> treeMap = new TreeMap<>();
    treeMap.putAll(hashMap);
    treeMap.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

    /**
     * 2.1 Sort a hashMap by value:
     * set up a helper method involving comparable interface
     */
    System.out.println("______sort a hashMap by value using Comparable interface_____");
    Map<Integer, String> sortedMap = sortByValue(hashMap);
    sortedMap.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

  }

  //2.1 helper() to sort a hm by value
  public static <K extends Comparable, V extends Comparable> Map<K, V> sortByValue(Map<K, V> map) {
    List<Entry<K, V>> entries = new LinkedList<Entry<K, V>>(map.entrySet());
    Collections.sort(entries, new Comparator<Entry<K, V>>() {
      @Override
      public int compare(Map.Entry<K, V> entry1, Map.Entry<K, V> entry2) {
        return entry1.getValue().compareTo(entry2.getValue());
      }
    });

    Map<K, V> sortedMap = new LinkedHashMap<K, V>();
    for (Map.Entry<K, V> entry : entries) {
      sortedMap.put(entry.getKey(), entry.getValue());
    }
    return sortedMap;
  }
}


