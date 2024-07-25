
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("""
                                Selecciona la actividad a realizar:
                                1. Buscando un elemento
                                2. Copiando elementos
                                """);
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {

                        int[] array1 = new int[3];
                        System.out.println("Ingresa tres números enteros:");

                        array1[0] = scanner.nextInt();
                        array1[1] = scanner.nextInt();
                        array1[2] = scanner.nextInt();

                        System.out.println("Ingresa el comparador:");
                        int comparador = scanner.nextInt();

                        String mensaje = (comparador == array1[0] || comparador == array1[1] || comparador == array1[2]) ? "El número está presente en el array." : "El número no está presente en el array.";
                        System.out.println(mensaje);

                    }

                    case 2 -> {

                        int[] original = {1, 2, 3};
                        int[] nuevoArray = {original[0], original[1], original[2], 0, 0};
                        System.out.println("Ingresa dos números para las nuevas posiciones del array:");
                        nuevoArray[3] = scanner.nextInt();
                        nuevoArray[4] = scanner.nextInt();
                        System.out.println("Contenido del nuevo array: {" + nuevoArray[0] + "," + nuevoArray[1] + "," + nuevoArray[2] + "," + nuevoArray[3] + "," + nuevoArray[4] + "," + "}");
                        //System.out.println("Contenido del nuevo array: {" + Arrays.toString(nuevoArray) + "}");
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
