//  Queue: FIFO data structure  dequeue(remove) enqueue(Add)

import java.util.Queue;
import java.util.LinkedList;

public class Queue_ {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>() ;
    
    queue.offer("Rutuja");
    queue.offer("Chad");
    queue.offer("Din");
    queue.offer("Harold");
    // System.out.println(queue.isEmpty());
    // System.out.println(queue.size());

    //System.out.println(queue.contains("din"));

    // System.out.println(queue);
    // System.out.println(queue.peek());
    // queue.poll();
    // queue.poll();
    // System.out.println(queue);
  }
}
