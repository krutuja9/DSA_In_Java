import java.util.*;

public class Priority_que {

  public static void main(String args[]){
    // proprity Queue = FIFO data structure that servers elements with the highest priorities first before elements with lower priority

    Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.offer("B");
    queue.offer("C");
    queue.offer("A");
    queue.offer("D");

    while (!queue.isEmpty()) {
      System.err.println(queue.poll());
    }
  }
  
}