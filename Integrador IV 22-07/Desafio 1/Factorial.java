
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int numero = -1;
            long factorial = 1;

            while (numero < 0) {
                System.out.print("\n\nIngrese un número entero positivo: ");
                try {
                    numero = scanner.nextInt();
                    if (numero < 0) {
                        System.out.println("El número no es positivo. Intente de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    scanner.next();
                }
            }

            int i = 1;
            do {
                factorial *= i;
                i++;
            } while (i <= numero);

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
