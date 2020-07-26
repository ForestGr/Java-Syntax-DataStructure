package queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue collection example.
 * https://www.callicoder.com/java-queue/
 */

public class QueueExample {
  public static void main(String[] args) {
    // Create and initialize a Queue using a LinkedList
    Queue<String> waitingQueue = new LinkedList<>();

    // Adding new elements to the Queue (The Enqueue operation)
    waitingQueue.add("Peter");
    waitingQueue.add("Chris");
    waitingQueue.add("John");
    waitingQueue.add("Mark");
    waitingQueue.add("Steven");

    System.out.println("WaitingQueue : " + waitingQueue);

    /**
    * 1.Removing an element from the Queue (The Dequeue operation)
    */
    // The remove() method throws NoSuchElementException if the Queue is empty
    String name = waitingQueue.remove();
    System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

    // The poll() method is similar to remove() except that it returns null if the Queue is empty.
    name = waitingQueue.poll();
    System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

    /**
     * 2.Get the element at the front of the Queue without removing it
     */
    // The element() method throws NoSuchElementException if the Queue is empty
    System.out.println("First Person in the Waiting Queue (element()) : " + waitingQueue.element());

    // The peek() method is similar to element() except that it returns null if the Queue is empty
    System.out.println("First Person in the Waiting Queue : " + waitingQueue.peek());


    /**
     * 3.Iterating over a Queue in Java
     */
    System.out.println("=== Iterating over a Queue using Java 8 forEach() ===");
    waitingQueue.forEach(person -> {
      System.out.println(person);
    });

    System.out.println("\n=== Iterating over a Queue using iterator() ===");
    Iterator<String> queueIterator = waitingQueue.iterator();
    while (queueIterator.hasNext()) {
      String person = queueIterator.next();
      System.out.println(person);
    }

    System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
    for(String person: waitingQueue) {
      System.out.println(person);
    }

    // Check if a Queue is empty
    System.out.println("is waitingQueue empty? : " + waitingQueue.isEmpty());

    // Find the size of the Queue
    System.out.println("Size of waitingQueue : " + waitingQueue.size());

    // Check if the Queue contains an element
    name = "Johnny";
    if(waitingQueue.contains(name)) {
      System.out.println("WaitingQueue contains " + name);
    } else {
      System.out.println("Waiting Queue doesn't contain " + name);
    }

  }
}
