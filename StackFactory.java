public class StackFactory {
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
