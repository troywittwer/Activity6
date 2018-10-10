import java.util.ArrayList;

public class GenericStack<T> {

  private int top;
  private ArrayList<T> items;

  public GenericStack() {
    items = new ArrayList();
    top = 0;
  }

  public void push(T item) {

    items.add(item);
    top++;
  }

  public T pop() {
    if (isEmpty()) {
      throw new GenericStackException("Underflow Error");
    }
    return items.get(--top);
  }

  public boolean isEmpty() {
    return (top == 0);
  }

  public static class GenericStackException extends RuntimeException {

    public GenericStackException(String message) {
      super(message);
    }
  }

  public static void main(String[] args) {
    GenericStack<Integer> stack = new GenericStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    //stack.push(4); //overflow error

    GenericStack<String> stackString = new GenericStack();
    stackString.push("One");
    stackString.push("Two");
    stackString.push("Three");

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    System.out.println(stackString.pop());
    System.out.println(stackString.pop());
    System.out.println(stackString.pop());

  }
}