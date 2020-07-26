package arrayList;

import java.util.*;

/**
 * How to iterate through Java List? Seven (7) ways to Iterate Through Loop in Java.
 * 1. Simple For loop
 * 2. Enhanced For loop
 * 3. Iterator of Collection interface
 * 4. ListIterator of List interface
 * 5. While loop
 * 6. Java8 Iterable.forEach() util
 * 7. Java8 Stream.forEach() util
 */

public class Iterate {

  public static void main(String[] argv) {

    // create list
    List<String> myList = new ArrayList<String>();

    // add 4 different values to list
    myList.add("Facebook");
    myList.add("Paypal");
    myList.add("Google");
    myList.add("Yahoo");

    // 1. Simple For loop
    System.out.println("==============> 1. Simple For loop Example.");
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    // 2. Enhanced For loop
    System.out.println("==============> 2. for each loop Example.");
    for (String element : myList) {
      System.out.println(element);
    }

    // 3. while loop
    System.out.println("\n==============> 3. While Loop");
    int i = 0;
    while (i < myList.size()) {
      System.out.println(myList.get(i));
      i++;
    }

    // 4. Iterator of Collection interface
    System.out.println("==============> 4. Iterator of Collection interface");
    Iterator<String> myIterator = myList.iterator();
    while (myIterator.hasNext()) {
      System.out.println(myIterator.next());
    }

    // 5. ListIterator of List interface
    // An iterator for lists that allows the programmer to traverse the list in either direction,
    // modify the list during iteration, and obtain the iterator's current position in the list.
    System.out.println("==============> 5. ListIterator of List interface");
    ListIterator<String> myListIterator = myList.listIterator(); //区别在一个是.iterator(), 一个是.listIterator()
    while (myListIterator.hasNext()) {
      System.out.print(myListIterator.next() + " ");
    }
    System.out.println("\n");
    while (myListIterator.hasPrevious()) {
      System.out.print(myListIterator.previous() + " ");
    }


    // 6. Java8 forEach() util: Returns a sequential Stream with this collection as its source
    System.out.println("\n==============> 6. Iterable.forEach() Example....");
    myList.forEach((element) -> {
      System.out.println(element);
    });

    // 7. Java8 collection Stream.forEach() util: Returns a sequential Stream with this collection as its source
    System.out.println("\n==============> 7. Stream.forEach() Example....");
    myList.stream().forEach((Temp) -> System.out.println(Temp));
  }
}
