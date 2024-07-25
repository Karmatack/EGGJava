
import java.util.InputMismatchException;
import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int posicion = -1;

            while (posicion < 0) {
                System.out.print("\n\nIngrese la posición en la serie de Fibonacci (número entero no negativo): ");
                try {
                    posicion = scanner.nextInt();
                    if (posicion < 0) {
                        System.out.println("La posición debe ser un número entero no negativo. Intente de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    scanner.next();
                }
            }

            int a = 0;
            int b = 1;
            int valorFibonacci = 0;

            switch (posicion) {
                case 0 ->
                    valorFibonacci = 0;
                case 1 ->
                    valorFibonacci = 1;
                default -> {
                    System.out.print("Serie : 0 1");
                    for (int i = 2; i <= posicion - 1; i++) {
                        valorFibonacci = a + b;
                        a = b;
                        b = valorFibonacci;

                        System.out.print(" " + valorFibonacci);
                    }
                }
            }

            System.out.println("\nEl valor en la posición " + posicion + " de la serie de Fibonacci es: " + valorFibonacci);
        }
    }
}
