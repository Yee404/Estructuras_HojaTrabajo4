import java.util.*;

public class Converter {

    public StackInterface Stack;

    public Converter(StackInterface Stack) {
        this.Stack = Stack;
    }

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
