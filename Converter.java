import java.util.*;

/**
 * Clase que realiza la conversión de expresiones postfix a infix.
 */
public class Converter {

    /**
     * Interfaz que define las operaciones de una pila.
     */
    public StackInterface Stack;

    /**
     * Constructor de la clase Converter.
     * 
     * @param Stack Objeto que implementa la interfaz StackInterface para
     *              representar la pila.
     */
    public Converter(StackInterface Stack) {
        this.Stack = Stack;
    }

    /**
     * Convierte una expresión postfix a infix.
     * 
     * @param expr Expresión en formato postfix.
     * @return Expresión convertida a formato infix.
     */
    public String PostfixToInfix(String expr) {
        StringBuilder postfix = new StringBuilder();

        String expression;
        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c).append(" ");
                // agrega espacio entre operadores

            } else if (c == '(') {
                Stack.push(c);

            } else if (c == ')') {
                while (!Stack.isEmpty() && Stack.peek() != '(') {
                    postfix.append(Stack.pop()).append(" ");
                }
                Stack.pop();

            } else {
                while (!Stack.isEmpty() && precedence(c) <= precedence(Stack.peek())) {
                    postfix.append(Stack.pop()).append(" "); // Agregar un espacio después de cada operador
                }
                Stack.push(c);
            }

        }

        while (!Stack.isEmpty()) {
            postfix.append(Stack.pop()).append(" "); // Agregar un espacio después de cada operador
        }

        return postfix.toString().trim();
    }

    /**
     * Determina la precedencia de un operador.
     * 
     * @param operator Operador a evaluar.
     * @return Valor numérico que representa la precedencia del operador.
     */
    private int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

}
