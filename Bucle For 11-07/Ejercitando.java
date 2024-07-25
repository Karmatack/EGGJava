
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercitando {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] array = {5, 12, 3, 8, 9};
            System.out.println("""
                            Selecciona la actividad a realizar:
                            1. Imprimiendo elementos
                            2. Encontrando el valor mínimo 
                            3. Imprimiendo elementos en orden inverso
                            """);
            System.out.print("Digite la opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    //System.out.println("Contenido del array: " + Arrays.toString(array));
                    System.out.println("Elementos del array:");
                    for (int num : array) {
                        System.out.println(num);
                    }
                }

                case 2 -> {
                    int min = array[0];
                    for (int i = 1; i < array.length; i++) {
                        if (array[i] < min) {
                            min = array[i];
                        }
                    }
                    System.out.println("El valor mínimo en el array es: " + min);
                }

                case 3 -> {
                    System.out.println("Orden inverso:");
                    for (int i = array.length - 1; i >= 0; i--) {
                        System.out.println(array[i]);
                    }
                }

                default -> {
                    System.out.println("Opción no válida.");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado no es numérico.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
