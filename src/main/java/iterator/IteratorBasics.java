package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * http://tutorials.jenkov.com/java-collections/iterator.html
 * Iterator interface (动词性质，提供方法) has 3 methods:
 * boolean hasNext(): no param, return boolean (true if there are elements in the collection)
 * E next(): no param, return E (the next element in the collection)
 * void remove(): no param, no return, remove the last elm in the collection
 */
public class IteratorBasics {
  public static void main(String[] args) {
    /* 1. Make a collection*/
    ArrayList<Integer> numList = new ArrayList<>();
    numList.add(12);
    numList.add(8);
    numList.add(2);
    numList.add(23);

    //建list的另一种方法，当然了这个object在接下来iterator中不会被用到
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(12,8,2,23));

    Set<String> set = new HashSet<>();
    set.add("one");
    set.add("two");
    set.add("three");

    //建set的另一种方法，当然了这个object在接下来iterator中不会被用到
    Set<String> set2 = new HashSet<>(Arrays.asList("one","two","three"));

    Map<String, String> map = new HashMap<>();
    map.put("key1","value1");
    map.put("key2","value2");

    /**
    * Iterable interface (名词性质，提供框架)
    * It contains only one abstract method: Iterator<T> iterator()
    */
    /* 2. Obtain the iterator*/
    Iterator<Integer> listItr = numList.iterator();

    Iterator<String> setItr = set.iterator();

    Iterator<String> keyItr = map.keySet().iterator();
    Iterator<String> valueItr = map.values().iterator();

    Iterator<Map.Entry<String, String>> entryItr = map.entrySet().iterator();


    /* 3. using iterator() to loop through*/
    System.out.println("--------Print the first item---------");
    System.out.println(listItr.next()); // Print the first item

    System.out.println("--------Loop through a collection---------");
    while(listItr.hasNext()) {
      System.out.println(listItr.next()); // Loop through a collection
    }


    /**
     * 4.remove：Iterator在这种情况下明显优于for loop和for-each loop： when collection is changing size,
     * at the same time that the code is trying to loop.
     * Calling remove() does not cause a ConcurrentModificationException to be thrown.
     */
    System.out.println("-------Remove element using iterator-------");

    //iterator里的i是element, 不用i--
    Iterator<Integer> listItr2 = numList.iterator();
    while(listItr2.hasNext()) {
      Integer i = listItr2.next();
      if(i < 10) {
        listItr2.remove(); //***重要：must call iterator, not the object itself(here the list)
      }
    }
    System.out.println(numList);

    /*//for loop里的i是index, 千万不要忘i--
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) < 10) {
        numbers.remove(numbers.get(i));
        i--; //don't forget!
      }
    }
    System.out.println(numbers);*/

    /*//for-each loop: WRONG，执行remove永远不能用for-each loop, 无法改进
    for (Integer num : numbers) {
      if (num < 10) {
        numbers.remove(num);
      }
    }
    System.out.println(numbers);*/

    while (setItr.hasNext()) {
      System.out.println(setItr.next());
      setItr.remove(); //每iterate到一个ele后就remove掉它，所以最后都remove了size变0
    }
    System.out.println(set.size());
  }

}
