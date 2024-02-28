/* se usa para implementar el menu aparte de mandar a llamar a la calculadora para que se puedan hacer los calculos  */

/*Datos sacado de chat GPT.
    Pregunta
 * que import se necesitan para que mi codigo pueda leer un documento de estilo txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    Pregunta 
    como se crearia un public void para cargar los datos del archivo 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Menu {
    private String datos;

    public Menu() {
        this.datos = null;
    }

    public void cargarDatos(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            this.datos = sb.toString().trim();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo cargar el archivo.");
            e.printStackTrace();
        }
    }

    // Resto del código...

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.ejecutarMenu();
    }
}

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Menu {
    /**
     *
     */
    private String DATOS;
    private String archivo;

    public Menu() {
        this.DATOS = null;
    }

    public void cargarDatos(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            this.DATOS = sb.toString().trim();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Error: No se pudo cargar el archivo.");
            e.printStackTrace();
        }
    }

    public void mostrarDatos() {
        if (this.DATOS != null) {
            System.out.println("Datos:");
            System.out.println(this.DATOS);
        } else {
            System.out.println("Error: No se han cargado datos. Por favor, carga los datos primero.");
        }
    }

    public void ejecutarMenu() {
        ICalculator miCalculador = new Calculadora();
        while (true) {
            System.out.println("\n---- Menú ----");
            System.out.println("1. Cargar datos desde archivo");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Salir");
            System.out.println("4. Imprimir la suma");
            System.out.println("5. Imprimir los resultados");
    
            System.out.print("Selecciona una opción: ");
            String opcion = System.console().readLine();
    
            switch (opcion) {
                case "1":
                System.out.print("Ingrese el nombre del archivo (por ejemplo, 'datos.txt'): ");
                String archivo = System.console().readLine();
                cargarDatos(archivo);
                break;
                
                case "2":
                    mostrarDatos();
                    break;
                case "3":
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    return;
                case "4":
                    try{
                        int resultado = miCalculador.solve(miCalculador.read("2 3 +  "));
                        System.out.println("El resultado de la suma es: " + resultado);
                    }catch(Exception e){
                        System.out.println("Se encontro un error " + e.getMessage());
                    }
                    break;
                case "5":
                    // Código para imprimir los resultados
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingresa una opción válida.");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.ejecutarMenu();
    }
}


