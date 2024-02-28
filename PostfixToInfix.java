import java.io.*;
import java.util.Scanner;

/**
 * Clase que realiza la conversión de expresiones postfix a infix
 * y presenta un menú para elegir la implementación de una pila.
 */
public class PostfixToInfix {
    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        try {
            BufferedReader Reader = new BufferedReader(new FileReader("datos.txt"));
            String Postfix = Reader.readLine();
            Reader.close();

            Scanner scanner = new Scanner(System.in);
            boolean Menu = true;

            while(Menu){
                System.out.println("Menú de Diseños ADT");
                System.out.println("1. ArrayList");
                System.out.println("2. Vector");
                System.out.println("3. Lista Simplemente Encadenada");
                System.out.println("4. Lista Doblemente Encadenada");
                System.out.println("5. Salir");
                int opcion = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ecuación postfix: " + Postfix);

                switch (opcion) {
                    case 1:
                        StackInterface ArrayListStack = StackFactory.createStack("ArrayList");
                        Converter Conv1 = new Converter(ArrayListStack);
                        String Postfix1 = Conv1.PostfixToInfix(Postfix);
                        System.out.println("Conversión de Postfix a Infix: " + Postfix1);
                        //Agregar vinculación con calculadora de HT2

                        

                    case 2:
                        StackInterface VectorStack = StackFactory.createStack("Vector");
                        Converter Conv2 = new Converter(VectorStack);
                        String Postfix2 = Conv2.PostfixToInfix(Postfix);
                        System.out.println("Conversión de Postfix a Infix: " + Postfix2);
                        //Agregar vinculación con calculadora de HT2

                    case 3:
                        //

                    case 4:
                        //

                    case 5:
                        Menu = false;
                        break;


                }
            }
        catch (IOException e) {
            System.err.println("Error con archivo");
        }
        }
    }
}