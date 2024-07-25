
import java.util.Random;
import java.util.Scanner;

public class adivinar {

    public static void main(String[] args) {
        Random random = new Random();
        int num_Random = random.nextInt(20) + 1;
        try (Scanner scanner = new Scanner(System.in)) {
            int intento;

            System.out.println("¡Adivina el número, está entre el 1 y el 20");

            do {
                System.out.print("Ingresa tu adivinanza: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, Digite un número válido.");
                    scanner.next();
                    System.out.print("Ingresa el número: ");
                }
                intento = scanner.nextInt();

                String mensaje = (intento < num_Random) ? "El número es mayor que " + intento : (intento > num_Random) ? "El número es menor que " + intento : "Acertaste.";
                System.out.println(mensaje);
            } while (intento != num_Random);
        }
    }
}
