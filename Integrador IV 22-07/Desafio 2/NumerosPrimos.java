
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cantidad = -1;

            while (cantidad <= 0) {
                System.out.print("\n\nDigite la cantidad de números primos que desea obtener: ");
                try {
                    cantidad = scanner.nextInt();
                    if (cantidad <= 0) {
                        System.out.println("La cantidad debe ser un número entero positivo. Intente de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    scanner.next();
                }
            }

            int contador = 0;
            int numero = 2;
            System.out.println("\nNúmeros primos: ");
            while (contador < cantidad) {
                boolean esPrimo = true;

                if (numero < 2) {
                    esPrimo = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }

                if (esPrimo) {
                    System.out.print(numero + " ");
                    contador++;
                }

                numero++;
            }
        }
    }
}
