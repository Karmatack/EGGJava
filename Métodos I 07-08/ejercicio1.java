
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nombre = obtenerNombre(scanner);
            int edad = obtenerEdad(scanner);

            imprimeNombreYEdad(nombre, edad);

            scanner.close();
        }
    }

    public static String obtenerNombre(Scanner scanner) {
        System.out.println("Digitar un nombre:");
        return scanner.nextLine();
    }

    public static int obtenerEdad(Scanner scanner) {
        System.out.println("Digitar una edad:");
        return scanner.nextInt();
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}
