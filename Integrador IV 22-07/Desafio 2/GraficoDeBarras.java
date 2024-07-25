
import java.util.InputMismatchException;
import java.util.Scanner;

public class GraficoDeBarras {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[4];
            System.out.println("\n\nDigite 4 números positivos");
            for (int i = 0; i < numeros.length; i++) {
                while (true) {
                    System.out.print("Ingrese el número " + (i + 1) + " (entre 1 y 20): ");
                    try {
                        int numero = scanner.nextInt();
                        if (numero >= 1 && numero <= 20) {
                            numeros[i] = numero;
                            break;
                        } else {
                            System.out.println("El número debe estar entre 1 y 20. Intente de nuevo.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, Digite un número entero.");
                        scanner.next();
                    }
                }
            }

            System.out.println("\nGráfico de Barras:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print((numeros[i]) + " ");
                for (int j = 0; j < numeros[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
