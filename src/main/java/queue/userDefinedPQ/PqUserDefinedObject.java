package queue.userDefinedPQ;

import java.util.PriorityQueue;

/**
 * The requirement for a PriorityQueue of user defined objects is that either：
 * 1.the class should implement the Comparable interface and implement the compareTo() function.
* 2. Or you should provide a custom Comparator while creating the PriorityQueue.
*/

public class PqUserDefinedObject {
  public static void main(String[] args) {
    PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();

    // Add items to the Priority Queue
    employeePriorityQueue.add(new Employee("Peter", 100.00));
    employeePriorityQueue.add(new Employee("Chris", 165.00));
    employeePriorityQueue.add(new Employee("Andrea", 115.00));
    employeePriorityQueue.add(new Employee("Jack", 107.00));
    System.out.println(employeePriorityQueue);

   //The compareTo() method implemented in the Employee class is used to determine the deque order
    while (!employeePriorityQueue.isEmpty()) {
      System.out.println(employeePriorityQueue.remove());
    }
  }
}