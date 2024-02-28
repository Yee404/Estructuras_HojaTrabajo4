import java.util.Vector;

public class Calculadora implements ICalculator {

    IStack<Integer> stackInterno = new IStackvector<Integer>(20);
    
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int substraction(int n1, int n2) {
        return n1 - n2;
    }

    // Abner 
    @Override
    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    // abner 
    @Override
    public int division(int n1, int n2) throws Exception {
        return n1 / n2;
    }

    @Override
    public int residue(int n1, int n2) throws Exception {
        return n1 % n2;
    }

    @Override
    public Vector<String> read(String charactersString) throws Exception {
        // Separar los caracteres del string y agregarlos al vector temporal
        String[] elementsArray = charactersString.split("\\s+");
        Vector<String> temporal = new Vector<String>();
        for (String element : elementsArray) {
            temporal.add(element);
        }
        return temporal;
    }

    @Override
    public int solve(Vector<String> elements) throws Exception {
        for (String element : elements) {
            if (isNumeric(element)) {
                // Si es un número, lo introducimos en la pila
                stackInterno.push(Integer.parseInt(element));
            } else {
                // Si es un operador, extraemos los dos últimos elementos de la pila y realizamos la operación
                int operand2 = stackInterno.pop();
                int operand1 = stackInterno.pop();

                switch (element) {
                    case "+":
                        stackInterno.push(add(operand1, operand2));
                        break;
                    case "-":
                        stackInterno.push(substraction(operand1, operand2));
                        break;
                    case "*":
                        stackInterno.push(multiplication(operand1, operand2));
                        break;
                    case "/":
                        stackInterno.push(division(operand1, operand2));
                        break;
                    default:
                        throw new UnsupportedOperationException("Unsupported operator: " + element);
                }
            }
        }

        if (stackInterno.size() == 1) {
            // Si queda un solo elemento en la pila, lo devolvemos como resultado
            return stackInterno.pop();
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

    // Método auxiliar para verificar si un string es un número
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int add(Vector<Integer> vector) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}


