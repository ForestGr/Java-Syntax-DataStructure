package stackQueueImp;
/**
 * Describes an immutable Stack ADT.
 * @param <E> The data type to store in the Stack.
 */
public interface Stack<E> {

  /**
   * Pushes an element on to the Stack
   * @param element The element to add to the Stack.
   * @return A new Stack with the new element added.
   */
  void push(E element);


  /**
   * Removes the most recently added element.
   * @return A new Stack without the most recently added element.
   */
  E pop();


  /**
   * Returns, but does not remove, the most recently added element.
   * @return The most recently added element.
   */
  E top();
}