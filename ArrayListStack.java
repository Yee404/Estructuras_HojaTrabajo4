import java.util.*;

/**
 * Implementación de la interfaz StackInterface utilizando un ArrayList.
 */
public class ArrayListStack implements StackInterface {

    /** ArrayList que representa la pila. */
    public ArrayList<String> Stack;

    /**
     * Constructor de la clase ArrayListStack.
     * Inicializa el ArrayList utilizado como pila.
     */
    public ArrayListStack() {
        Stack = new ArrayList<>();
    }

    /**
     * Agrega un elemento a la pila.
     * 
     * @param string Elemento a agregar.
     */
    public void push(String string) {
        Stack.add(string);
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     * 
     * @return Elemento en la cima de la pila.
     */
    public String pop() {

        return Stack.remove(Stack.size() - 1);
    }

    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     * 
     * @return Elemento en la cima de la pila.
     */
    public String peek() {

        return Stack.get(Stack.size() - 1);
    }

    /**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return Stack.isEmpty();
    }

    /**
     * Método no implementado. Lanza una excepción UnsupportedOperationException.
     * 
     * @param c Carácter a agregar a la pila.
     * @throws UnsupportedOperationException Si el método no está implementado.
     */
    @Override
    public void push(char c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

}
