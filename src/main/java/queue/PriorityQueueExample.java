package queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * A priority queue in Java is a special type of queue wherein all the elements are ordered
 * as per their natural ordering (从小到大，头最小尾最大) or based on a custom Comparator supplied
 * at the time of creation. The front of the priority queue contains the least element according
 * to the specified ordering, and the rear (end) of the priority queue contains the greatest element.
 * So when you remove an element from the priority queue, the smallest element according to the
 * specified ordering is removed first.
 */

public class PriorityQueueExample {
  public static void main(String[] args) {

    /**
     * 1.Create a priority queue made up of integers
     */
    System.out.println("-------1.Create a priority queue made up of integers-------");
    PriorityQueue<Integer> numbers = new PriorityQueue<>();
    // Add items to a Priority Queue (ENQUEUE)
    numbers.add(750);
    numbers.add(500);
    numbers.add(900);
    numbers.add(100);
    System.out.println("Priority Queue made of nums " + numbers);

    //对比普通queue
    Queue<Integer> numbers2 = new LinkedList<>();
    numbers2.add(750);
    numbers2.add(500);
    numbers2.add(900);
    numbers2.add(100);
    System.out.println("Queue made of nums " + numbers2);

    // Remove items from the Priority Queue (DEQUEUE)
    System.out.println("Remove items from the Priority Queue (DEQUEUE): smallest is removed first");
    while (!numbers.isEmpty()) {
      System.out.println(numbers.remove());
    }

    /**
     * 2.Create a priority queue made up of strings
     */
    System.out.println("-------2.Create a priority queue made up of strings-------");
    PriorityQueue<String> people = new PriorityQueue<>();
    // Add items to a Priority Queue (ENQUEUE)
    people.add("Lisa");
    people.add("Robert");
    people.add("John");
    people.add("Chris");
    people.add("Angelina");
    people.add("Joe");
    System.out.println("Priority Queue made of string "+ people + "//字母顺序a-z(小-大）排序");

    // Remove items from the Priority Queue (DEQUEUE)
    System.out.println("Remove items from the Priority Queue (DEQUEUE): smallest is removed first");
    while (!people.isEmpty()) {
      System.out.println(people.remove());
    }

    /**
     * 3.Create a priority queue with a custom Comparator
     */
    System.out.println("-------3.Create a priority queue with a custom Comparator-------");
    Comparator<String> stringLengthComparator = new Comparator<>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.length() - s2.length();
      }
    };

    //The above Comparator can also be created using lambda expression
    Comparator<String> stringLengthComparator2 = (s1, s2) -> {
      return s1.length() - s2.length();
    };

    //Which can be shortened even further like this
    Comparator<String> stringLengthComparator3 = Comparator.comparingInt(String::length);

    // Create a Priority Queue with a custom Comparator
    PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

    // Add items to a Priority Queue (ENQUEUE)
    namePriorityQueue.add("Lisa");
    namePriorityQueue.add("Robert");
    namePriorityQueue.add("John");
    namePriorityQueue.add("Chris");
    namePriorityQueue.add("Angelina");
    namePriorityQueue.add("Joe");
    System.out.println("pq with a custom comparator " + namePriorityQueue); //为啥这个不按str length的顺序来？
    System.out.println("Remove items from the PQ (DEQUEUE): smallest length is removed first");
    while (!namePriorityQueue.isEmpty()) {
      System.out.println(namePriorityQueue.remove());
    }
  }
}
