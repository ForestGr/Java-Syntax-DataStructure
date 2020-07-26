package stackQueueImp;

import java.util.LinkedList;

/**
 * Describes an immutable Queue ADT.
 * @param <E> The data type to store in the ADT.
 */
public interface Queue<E> {

  /**
   * Adds an element to the queue.
   * @param element The element to add.
   */
  public void enqueue(E element);


  /**
   * Removes the least recently added element.
   * @return A new Queue with element removed.
   */
  public E dequeue();


  /**
   * Returns but does not remove the least recently added element.
   * @return The element at the front of the Queue.
   */
  public E front();

}