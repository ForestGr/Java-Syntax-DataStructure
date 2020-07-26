package nested;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListOfMap {
  public static void main(String[] args) {

    // HashMap 1: input preparation for WEST India Region
    Map<String, String> west = new HashMap<String, String>();
    west.put("Maharashtra", "Mumbai");
    west.put("Gujarat", "Gandhinagar");
    west.put("Goa", "Panaji");

    // HashMap 2: input preparation for SOUTH India Region
    Map<String, String> south = new HashMap<String, String>();
    south.put("Andhra Pradesh", "Amaravati");
    south.put("Tamil Nadu", "Chennai");
    south.put("Telangana", "Hyderabad");

    // HashMap 3: input preparation for EAST India Region
    Map<String, String> east = new HashMap<String, String>();
    east.put("Bihar", "Patna");
    east.put("West Bengal", "Kolkata");
    east.put("Odisha", "Bhubaneswar");

    // HashMap 4: input preparation for SOUTH India Region
    Map<String, String> north = new HashMap<String, String>();
    north.put("Delhi", "New Delhi");
    north.put("Jammu n Kashmir", "Srinagar");
    north.put("Punjab", "Chandigarh");

    // create ArrayList and insert all 5 HashMap into it
    List<Map<String, String>> listOfIndianRegions = new ArrayList<Map<String, String>>();

    // add all 4 regions to AL
    listOfIndianRegions.add(west);
    listOfIndianRegions.add(south);
    listOfIndianRegions.add(east);
    listOfIndianRegions.add(north);

    //line55-59 can also be written as:
    //Collections.addAll(listOfIndianRegions, west, south, east, north);

    /**
     * Way 1: Iterate using for-each and loop through Map using entrySet() method
     * */
    System.out.println("Way 1: Iterate using for-each and loop through Map using entrySet() method");

    // temp variable to indicate zone/region
    int regionIndex = 1;

    // get Iterator for looping through AL
    Iterator<Map<String, String>> iterator = listOfIndianRegions.iterator();

    // iterate AL using while-loop
    while(iterator.hasNext()) {
      System.out.println("\nIndia Region - " + regionIndex);
      Map<String, String> region = iterator.next();

      // getting entrySet() into Set
      Set<Entry<String, String>> entrySet = region.entrySet();

      // for-each loop
      for(Entry<String, String> entry : entrySet) {
        System.out.println("State : " + entry.getKey() + "\tCapital : " + entry.getValue());
      }

      // increment region index by 1
      regionIndex++;
    }

    /**
     *  Way 2: Iterate using Iterator interface and loop through Map using keySet() method
     */
    System.out.println("\nWay 2: Iterate using Iterator interface and loop through Map using keyset() method");

    // temp variable to indicate zone/region
    int regionIndex2 = 1;

    for(Map<String, String> region : listOfIndianRegions) {
      System.out.println("\nIndia Region - " + regionIndex2);

      // get entrySet() into Set
      Set<String> setOfIndianStates = region.keySet();

      // Collection Iterator
      Iterator<String> iterator2 = setOfIndianStates.iterator();

      // iterate using while-loop after getting Iterator
      while(iterator2.hasNext()) {
        String key = iterator2.next();
        System.out.println("State : " + key + "\tCapital : " + region.get(key));
      }

      // increment region index by 1
      regionIndex2++;
    }
  }
}
