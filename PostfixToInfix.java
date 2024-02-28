import java.io.*;
import java.util.Scanner;

public class PostfixToInfix {
    public static void main(String[] args) {
        try {
            BufferedReader Reader = new BufferedReader(new FileReader("datos.txt"));
            String infixExpression = Reader.readLine();
            Reader.close();

            Scanner scanner = new Scanner(System.in);
            boolean Menu = true;

            while(Menu){
                System.out.println("Menú de Diseños ADT");
                System.out.println("1. ArrayList");
                System.out.println("2. Vector");
                System.out.println("3. Lista Simplemente Encadenada");
                System.out.println("4. Lista Doblemente Encadenada");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        StackInterface ArrayListStack = StackFactory.createStack("ArrayList");

                    case 2:
                        StackInterface VectorStack = StackFactory.createStack("Vector");
                }
            }
        }
    }
}