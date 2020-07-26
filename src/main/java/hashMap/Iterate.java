package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * HashMap Class 4
 * Iterate through a hashMap
 */
public class Iterate {

  public static void main(String[] args) {
    //Create a HashMap object called capitalCities
    HashMap<String, String> map = new HashMap<String, String>();

    map.put("England", "London");
    map.put("Germany", "Berlin");
    map.put("Norway", "Oslo");
    map.put("USA", "Washington DC");

    System.out.println("------ 1. Print the original HashMap -------");
    System.out.println(map);

    //1. keySet() method and for-each loop
    System.out.println("------1. keySet() method and for-each loop--------");
    for (String key : map.keySet()) {
      System.out.println("Country: " + key);
    }
    for (String value : map.values()) { //map.values() 和map.get(key)同等效力
      System.out.println("Capital: " + value);
    }
    //以上可合写成：
    for (String key : map.keySet()) {
      System.out.println("Country (key): " + key + ",Capital (value): " + map.get(key));
    }

    //2. entrySet() method and for-each loop
    System.out.println("------2. entrySet() method and for-each loop--------");
    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
    }

    //3. keySet() method and Iterator interface
    System.out.println("------3. keySet() method and Iterator interface--------");
    Iterator<String> keyItr = map.keySet().iterator();
    while (keyItr.hasNext()) {
      String key = keyItr.next();
      String value = map.get(key);
      System.out.println("key: " + key + ", value: " + value);
    }

    //4. values() method and Iterator interface
    System.out.println("------4. values() method and Iterator interface--------");
    Iterator<String> valueItr = map.values().iterator();
    while (valueItr.hasNext()) {
      String value = valueItr.next();
      System.out.println("value: " + value);
    }

    //5. entrySet() method and Iterator interface
    System.out.println("------5. entrySet() method and Iterator interface--------");
    Iterator<Entry<String, String>> entryIterator = map.entrySet().iterator();
    while (entryIterator.hasNext()) {
      Entry<String, String> entry = entryIterator.next();
      System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
    }

    //6. Java8 ForEach()
    System.out.println("------6. Java8 ForEach()--------");
    map.forEach((k,v) ->System.out.println("Key: " + k + " Value: " + v));

  }
}