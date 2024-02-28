import java.util.*;

public class VectorStack implements StackInterface {

    public Stack<Character> Stack;

    public VectorStack() {
        Stack = new Stack<>();
    }

    @Override
    public void push(char c) {
        Stack.push(c);
    }

    @Override
    public char pop() {
        return Stack.pop();
    }

    @Override
    public char peek() {
        return Stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return Stack.isEmpty();
    }

}
