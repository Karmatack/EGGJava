import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random();

        // Usar try-with-resources para manejar automáticamente el cierre del Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("""
                                Seleccione una actividad:
                                1. Calcular la potencia
                                2. Calcular la raíz cuadrada
                                """);

            int option = scanner.nextInt();

            switch (option) {

                case 1 -> {

                    System.out.println("Ingrese la base:");
                    int base = scanner.nextInt();
                    System.out.println("Ingrese el exponente:");
                    int exponente = scanner.nextInt();
                    System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + Math.pow(base, exponente));
                }

                case 2 -> {

                    System.out.println("Ingrese un número positivo:");
                    double numero = scanner.nextDouble();
                    if (numero < 0) {
                        System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
                    } else {
                        System.out.println("La raíz cuadrada de " + numero + " es: " + Math.sqrt(numero));
                    }
                }

                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
