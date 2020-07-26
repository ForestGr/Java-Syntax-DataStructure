package stackQueueImp;

import java.util.LinkedList;

public class MyStack<E> implements Stack<E> {
  private LinkedList<E> s = new LinkedList<E>();


  @Override
  public void push(E element) {
    s.addFirst(element);
  }

  public E pop() {
    return s.removeFirst();
  }

  @Override
  public E top() {
    return s.getFirst();
  }

  public String toString() {
    return s.toString();
  }

  public int size() {
    return s.size();
  }
}
