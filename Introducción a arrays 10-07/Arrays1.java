
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("""
                                Selecciona la actividad a realizar:
                                1. Sumando elementos
                                2. Promediando elementos
                                3. Encontrando el máximo
                                """);
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {

                        int[] array1 = {5, 10, 15};
                        int sum = 0;
                        for (int i = 0; i < array1.length; i++) {
                            sum += array1[i];
                        }
                        System.out.println("La suma de los elementos es: " + sum);
                    }

                    case 2 -> {

                        int[] array2 = new int[4];
                        int sum2 = 0;
                        System.out.println("Ingresa cuatro números enteros:");
                        for (int i = 0; i < array2.length; i++) {
                            array2[i] = scanner.nextInt();
                            sum2 += array2[i];
                        }

                        double promedio = (double) sum2 / array2.length;
                        System.out.println("La suma de los elementos es: " + sum2);
                        System.out.println("El promedio de los elementos es: " + promedio);
                    }
                    case 3 -> {

                        int[] array3 = new int[5];
                        int mayor = 0;
                        System.out.println("Ingresa cinco números enteros:");
                        for (int i = 0; i < array3.length; i++) {
                            array3[i] = scanner.nextInt();
                            if (mayor < array3[i]) {
                                mayor = array3[i];
                            }
                        }
                        System.out.println("El mayor de los elementos es: " + mayor);
                    }

                    default ->
                        System.out.println("Opción no válida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Valor ingresado no es numerico");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
}
