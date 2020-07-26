package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 /**
  * HashMap Class 3
  * The code below demonstrates how to convert keys or values in a map to an array or list
  */

public class Convert {
  public static void main(String[] args) {

    // keys are Strings
    // objects are also Strings
    Map<String, String> map = new HashMap<>();
    fillData(map);

    System.out.println("----convert keys to array----");
    String[] keyStrings = keysAsArray(map);
    for (String string : keyStrings) {
      System.out.println(string);
    }

    System.out.println("----convert keys to list----");
    List<String> keyList = keysAsList(map);
    for (String string : keyList) {
      System.out.println(string);
    }

    System.out.println("----convert values to array----");
    String[] strings = valuesAsArray(map);
    for (String valueString : strings) {
      System.out.println(valueString);
    }

    System.out.println("----convert values to list----");
    List<String> valueList = valuesAsList(map);
    for (String string : valueList) {
      System.out.println(string);
    }

  }

  //helper method 1
  private static void fillData(Map<String, String> map) {
    map.put("Android", "Mobile");
    map.put("Eclipse IDE", "Java");
    map.put("Eclipse RCP", "Java");
    map.put("Git", "Version control system");

  }

  //helper method 2: get keys
  private static String[] keysAsArray(Map<String, String> map) {
    return map.keySet().toArray(new String[map.keySet().size()]);
  }

  //helper method 3: get keys (assumes the key is of type String)
  private static List<String> keysAsList(Map<String, String> map) {
    List<String> list = new ArrayList<String>(map.keySet());
    return list;
  }

  //helper method 4: get values
  private static String[] valuesAsArray(Map<String, String> map) {
    return map.values().toArray(new String[map.values().size()]);
  }

  //helper method 4: get values (assumes the key is of type String)
  private static List<String> valuesAsList(Map<String, String> map) {
    List<String> list = new ArrayList<String>(map.values());
    return list;
  }

}