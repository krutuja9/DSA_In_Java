import java.util.*;
public class LinkedList_ {
public static void main(String[] args) {

  LinkedList<String> linkedList =new LinkedList<String>();
  // linkedList.push("A");
  // linkedList.push("B");
  // linkedList.push("C");
  // linkedList.push("D");
  // linkedList.pop();

    linkedList.offer("A");
    linkedList.offer("B");
    linkedList.offer("C");
    linkedList.offer("D");
    // linkedList.poll();
    linkedList.add(2,"T");
    // linkedList.remove("A");
    // System.out.println(linkedList.indexOf("B"));

    System.out.println(linkedList.peekFirst());
    System.out.println(linkedList.peekLast());

    linkedList.addFirst("O");
    linkedList.addLast("BB");

  System.out.println(linkedList);
}
}
