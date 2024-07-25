
import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosComplementarios {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int[] array = {5, 12, 3, 8, 9};

            System.out.println("""
                Selecciona la actividad a realizar:
                1. Invertir un array
                2. Calcular suma acumulada
                """);
            System.out.print("Digite la opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    for (int i = 0; i < array.length / 2; i++) {
                        int aux = array[i];
                        array[i] = array[array.length - 1 - i];
                        array[array.length - 1 - i] = aux;
                    }
                    System.out.println("Contenido del array: " + Arrays.toString(array));
                }

                case 2 -> {

                    int suma = 0;
                    for (int i = 0; i < array.length; i++) {
                        suma += array[i];
                        array[i] = suma;
                    }
                    System.out.println("Contenido del array: " + Arrays.toString(array));
                }

                default ->
                    System.out.println("Opción no válida");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
