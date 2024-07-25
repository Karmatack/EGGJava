
import java.util.InputMismatchException;
import java.util.Scanner;

public class DibujarCuadrado {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tamano = -1;

            while (tamano <= 0) {
                System.out.print("\n\nDigite el tamaño del cuadrado (número entero positivo): ");
                try {
                    tamano = scanner.nextInt();
                    if (tamano <= 0) {
                        System.out.println("El tamaño debe ser positivo. Digite nuevamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, Digite un número entero.");
                    scanner.next();
                }
            }

            for (int i = 0; i < tamano; i++) {
                if (i == 0 || i == tamano - 1) {
                    for (int j = 0; j < tamano; j++) {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                    for (int j = 1; j < tamano - 1; j++) {
                        System.out.print("  ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
