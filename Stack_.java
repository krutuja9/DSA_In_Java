import java.util.Stack;
public class Stack_{
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    Stack<Integer> stackInt = new Stack<Integer>();
    //System.out.println(stack.empty());
    stack.push("Minecraft");
    stack.push("FIVII");
    stack.push("DOOM");
    stack.push("Skyrim");
    stack.push("Borderlands");
    // System.out.println(stack.peek());

    // String myFavGame =  stack.pop();
    // System.out.println(stack.peek());
    // System.out.println(stack);
    // System.out.println(myFavGame);

    // System.out.println(stack.search("Borderland"));

    for(int  i =0;i<10;i++){
      stackInt.push(i);
    }
    System.out.println(stackInt);

  }
}
