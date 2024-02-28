/**
 * Clase de fábrica que proporciona una interfaz para crear instancias de
 * implementaciones de StackInterface.
 */
public class StackFactory {

    /**
     * Crea una instancia de StackInterface basada en el tipo especificado.
     * 
     * @param type Tipo de pila a crear ("ArrayList" o "Vector").
     * @return Instancia de StackInterface basada en el tipo especificado.
     * @throws IllegalArgumentException Si el tipo de pila no es válido.
     */
    public static StackInterface createStack(String type) {
        switch (type.toLowerCase()) {
            case "ArrayList":
                return new ArrayListStack();
            case "Vector":
                return new VectorStack();

            default:
                throw new IllegalArgumentException("Error. Tipo de Stack inválido.");
        }
    }
}
