
import java.util.Scanner;

public class practica {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            String contrasena;
            int numero;
            int digitos;

            do {
                System.out.print("""
                    Elige una opción:
                    1. Validación de contraseña
                    2. Contar número de dígitos de un número
                    3. Salir
                    Opción:  """);
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> {
                        do {
                            System.out.println("\nDigite la contraseña: ");
                            contrasena = scanner.nextLine();
                            if (!contrasena.equals("secreto")) {
                                System.out.println("Contraseña incorrecta. Prueba otra vez.");
                            }
                        } while (!contrasena.equals("secreto"));
                        System.out.println("Contraseña correcta!\n");
                    }

                    case 2 -> {
                        System.out.print("\nDigite un número entero: ");
                        numero = scanner.nextInt();
                        scanner.nextLine();
                        digitos = 0;
                        int numeroAbsoluto = Math.abs(numero);

                        if (numero == 0) {
                            digitos = 1;
                        } else {
                            while (numeroAbsoluto != 0) {
                                numeroAbsoluto /= 10;
                                digitos++;
                            }
                        }
                        System.out.println("\nEl número " + numero + " tiene " + digitos + " dígitos.\n");
                    }

                    case 3 ->
                        System.out.println("Saliendo del programa.");

                    default ->
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcion != 3);
        }
    }
}
