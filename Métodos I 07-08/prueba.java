
import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digitar un nombre:");
            String nombre = scanner.nextLine();
            imprimeNombre(nombre);

            System.out.println("Digistar un nombre:");
            nombre = scanner.nextLine();
            System.out.println("Digistar una edad:");
            int edad = scanner.nextInt();
            imprimeNombreYEdad(nombre, edad);

            scanner.close();
        }
    }

    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}
