package stackQueueImp;

import java.util.LinkedList;

public class MyQueue<E> implements Queue<E>  {
  private LinkedList<E> q = new LinkedList<E>();

  @Override
  public void enqueue(E element) {
    q.addLast(element);

  }

  @Override
  public E dequeue() {
    return q.removeFirst();
  }

  @Override
  public E front() {
    return q.getFirst();
  }

  public String toString() {
    return q.toString();
  }
}
