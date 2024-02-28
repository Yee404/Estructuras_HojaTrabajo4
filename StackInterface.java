import java.util.*;

/**
 * Interfaz que define las operaciones básicas de una pila.
 */
public interface StackInterface {

    /**
     * Agrega un carácter a la pila.
     * 
     * @param c Carácter a agregar.
     */
    void push(char c);

    /**
     * Elimina y devuelve el carácter en la cima de la pila.
     * 
     * @return Carácter en la cima de la pila.
     */
    char pop();

    /**
     * Devuelve el carácter en la cima de la pila sin eliminarlo.
     * 
     * @return Carácter en la cima de la pila.
     */
    char peek();

    /**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila está vacía, false en caso contrario.
     */
    boolean isEmpty();
}