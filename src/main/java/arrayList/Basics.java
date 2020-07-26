package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Source: https://www.callicoder.com/java-arraylist/
 */

public class Basics {

  public static void main(String[] args) {

    /**
     * 1. Initiate and add elements
     * */
    // create list
    List<String> myList = new ArrayList<String>();

    // add 4 different values to list
    myList.add("Facebook");
    myList.add("Paypal");
    myList.add("Google");
    myList.add("Yahoo");

    // Adding an element at a particular index in an ArrayList
    myList.add(2, "Twitter");

    /*Creating an ArrayList from another collection*/

    // Other way to define list
    List<String> yourList = Arrays.asList("Weibo", "TikTok", "Wechat", "Baidu");

    //create a List from another collection using the ArrayList(Collection c) constructor
    List<String> wholeList = new ArrayList<>(myList);

    //add all elements from an existing collection to the new List using the addAll() method
    wholeList.addAll(yourList);
    System.out.println(wholeList);

    /**
     * 2. Access elements
     * */
    wholeList.get(2);
    wholeList.get(wholeList.size() - 1);
    wholeList.set(5,"Qzone");
    System.out.println(wholeList);

    //get sublist of list: sublist(indexStart, indexEnd) include indexStart, exclude indexEnd
    List<String> sublist = wholeList.subList(1, 3);
    System.out.println("sublist: " + sublist);

    /**
     * 3. Remove elements
     * */
    System.out.println("_________PART3 REMOVE___________");
    //remove the element at a given index remove(int index)
    System.out.println(wholeList.remove(5));
    System.out.println(wholeList);

    //remove an element: remove(Object o), boolean method,return false if object not in list,
    // true if in the list and removed aft using the method
    System.out.println(wholeList.remove("Qzone")); //removed in remove(int index), so return false
    System.out.println(wholeList.remove("TikTok"));
    System.out.println(wholeList);

    //remove all elements from an ArrayList that exist in a given collection:
    // removeAll(name of collection to be removed)
    wholeList.removeAll(yourList);
    System.out.println(wholeList);

    //remove all elements matching a given predicate: removeIf()
    wholeList.removeIf(new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.startsWith("Y");
      }
    });
    System.out.println("Aft remove all ele start with 'Y': " + wholeList);

    /**
     * 4. Search elements
     * */
    // Check if an ArrayList contains a given element: boolean contains(object)
    System.out.println("_________PART4 SEARCH___________");
    System.out.println(wholeList.contains("Weibo"));

    wholeList.add("Google");
    // Find the index of the first occurrence of an element: indexOf(object)
    System.out.println(wholeList.indexOf("Google"));
    System.out.println(wholeList.indexOf("Netflix")); //return -1 if no such element

    // Find the index of the last occurrence of an element: lastIndexOf(object)
    System.out.println(wholeList.lastIndexOf("Google"));
  }
}
