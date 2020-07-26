package hashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap Class 1 hashMap基本方法
* Example of HashMap<String, String>()
 */
public class Basics {

  public static void main(String[] args) {
    /*Create a HashMap object called capitalCities*/
    HashMap<String, String> map = new HashMap<String, String>();

    /*1. Add keys and values (Country, City): hashMap.put(key, value)*/
    map.put("England", "London");
    map.put("Germany", "Berlin");
    map.put("Norway", "Oslo");
    System.out.println("Original map: " + map);

    /*Inserting all elements from another map*/
    HashMap<String, String> map1 = new HashMap<String, String>();
    map1.put("USA", "Washington DC");
    map1.put("Japan", "Tokyo");
    map.putAll(map1);
    System.out.println("Map aft adding map1: " + map);

    /*2. Access an item (value): hashMap.get(key)*/
    map.get("England");
    System.out.println("Access an item: " + map.get("England"));

    /*3. modify the value for a given key: put(K, V) 前提是key already exist in map*/
    map.put("England", "Bristol");
    System.out.println("map aft modify England: " + map);

    /*4. hashMap size: hashMap.size()*/
    map.size();
    System.out.println("map size: "+ map.size());

    /*5. Remove key*/
    // hashMap.remove(key)
    map.remove("England");
    //Remove a key only if it is associated with a given value: remove(K, V)
    map.remove("USA", "Seattle"); //key not associate with the given value, so not remove USA
    map.remove("Japan", "Tokyo"); //remove Japan successfully
    System.out.println("map aft removing: " + map);


    /*6. containsKey(Object key) & containsValue(Object value)*/
    System.out.println("------containsKey(Object key) & containsValue(Object value)-----");
    System.out.println("Does HashMap contains Germany as key: " + map.containsKey("Germany"));
    System.out.println("Does HashMap contains Berlin as value: " + map.containsValue("Berlin"));
    System.out.println("Does HashMap contains London as value: " + map.containsValue("London"));

    /*7. putIfAbsent(K,V): Add a new pair only if the key does not exist or is mapped to `null`.*/
    System.out.println("------putIfAbsent(K,V)-----");
    map.putIfAbsent("USA", "Seattle"); //key already exist, put unsuccessful
    map.putIfAbsent("Australia", "Canberra");
    System.out.println(map);

    /*8. getOrDefault(K,V): return a default value you supplied if no value is stored
    * in the map by the given key.*/
    System.out.println("------getOrDefault(K,V)-----");
    //nothing will change, as an existing value stores in the given key
    String capital1 = map.getOrDefault("USA", "Boston");//有key但key已有value的改不了，和put相反
    String capital2 = map.getOrDefault("Denmark", "Copenhagen"); //无key无value的加上
    System.out.println("Capital of USA is: " + capital1);
    System.out.println("Capital of Denmark is: " + capital2);
    System.out.println(map); //NOTE: 但capital2的pair并未加到map里

    /*9.Obtaining the entrySet, keySet, and values*/
    // HashMap's entry set
    Set<Entry<String, String>> countryCapitalEntries = map.entrySet();
    System.out.println("countryCapital entries : " + countryCapitalEntries);

    // HashMap's key set
    Set<String> countries = map.keySet();
    System.out.println("countries : " + countries);

    // HashMap's values
    Collection<String> capitals = map.values();
    System.out.println("capitals : " + capitals);
  }
}