import java.util.*;

/**
 * Implementación de la interfaz StackInterface que utiliza la clase Stack de
 * Java.
 */
public class VectorStack implements StackInterface {

    /**
     * Estructura de datos que almacena los elementos de la pila.
     */
    public Stack<Character> Stack;

    /**
     * Constructor que inicializa la pila como una instancia de Stack.
     */
    public VectorStack() {
        Stack = new Stack<>();
    }

    /**
     * Agrega un carácter a la pila.
     * 
     * @param c Carácter a agregar.
     */
    @Override
    public void push(char c) {
        Stack.push(c);
    }

    /**
     * Elimina y devuelve el elemento superior de la pila.
     * 
     * @return Elemento superior de la pila.
     */
    @Override
    public char pop() {
        return Stack.pop();
    }

    /**
     * Devuelve el elemento superior de la pila sin eliminarlo.
     * 
     * @return Elemento superior de la pila.
     */
    @Override
    public char peek() {
        return Stack.peek();
    }

    /**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return Stack.isEmpty();
    }
}

