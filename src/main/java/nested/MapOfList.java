package nested;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//https://www.benchresources.net/various-ways-to-iterate-over-hashmap-of-arraylist-in-java/
public class MapOfList {

  public static void main(String[] args) {

    // create HashMap of Continent & list of Top Countries
    Map<String, List<String>> continentTopCountries = new HashMap<String, List<String>>();

    // create ArrayList-1 for adding top countries of Asian Continent
    List<String> topCountriesOfAsiaContinent = new ArrayList<String>();
    // add top countries of Asian continent
    topCountriesOfAsiaContinent.add("India");
    topCountriesOfAsiaContinent.add("China");
    topCountriesOfAsiaContinent.add("Russia");
    topCountriesOfAsiaContinent.add("Japan");

    // put 1st entry as Asia and its list of Top countries
    continentTopCountries.put("Asia",topCountriesOfAsiaContinent);

    // create ArrayList-2 and adding top countries of Africa Continent
    //another way to initiate an arraylist
    List<String> topCountriesOfAfricaContinent = Arrays.asList("Libya","Zimbabwe","Nigeria","Kenya");

    // put 2nd entry as Africa and its list of Top countries
    continentTopCountries.put("Africa", topCountriesOfAfricaContinent);

    /* Way 1: Get keySet() and Iterate using for-each loop for ArrayList */
    System.out.println("Way 1: Get keySet() and Iterate using for-each loop");

    // get keySet() into Set
    Set<String> setOfKeySet = continentTopCountries.keySet();

    // for-each loop
    for(String key : setOfKeySet) {
      System.out.println("\nContinent: "  + key + "\nList of Top Countries of " + key + ":");
      for(String country : continentTopCountries.get(key)) {
        System.out.println("\t\t\t\t" + country);
      }
    }

    /* Way 2: Get entrySet() and iterate using Iterator interface for ArrayList */
    System.out.println("\nWay 2: Get entrySet() and iterate using Iterator interface for ArrayList");

    // get entrySet() into Set
    Set<Entry<String, List<String>>> entrySet = continentTopCountries.entrySet();

    // Collection Iterator
    Iterator<Entry<String, List<String>>> iterator = entrySet.iterator();

    while(iterator.hasNext()) {
      Entry<String, List<String>> entry = iterator.next();
      System.out.println("\nContinent: " + entry.getKey() + "\nList of Top Countries of " + entry.getKey() + ":");
      for(String country : entry.getValue()) {
        System.out.println("\t\t\t\t" + country);
      }
    }
  }
}
