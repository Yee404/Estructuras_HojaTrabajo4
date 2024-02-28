import java.util.*;

public class ArrayListStack implements StackInterface {

    public ArrayList<String> Stack;

    public ArrayListStack() {
        Stack = new ArrayList<>();
    }

    public void push(String string) {
        Stack.add(string);
    }

    public String pop() {
        return Stack.remove(Stack.size() - 1);
    }

    public String peek() {
        return Stack.get(Stack.size() - 1);
    }

    public boolean isEmpty() {
        return Stack.isEmpty();
    }

    @Override
    public void push(char c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

}
