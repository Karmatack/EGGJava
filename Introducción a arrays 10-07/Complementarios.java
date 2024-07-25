
import java.util.Arrays;
import java.util.Scanner;

public class Complementarios {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("""
                                1. Contar números pares en un array
                                2. Sumar elementos en posiciones pares de un array
                                3. Ordenar nombres alfabéticamente
                                """);
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        int[] array1 = {3, 6, 8, 5, 2, 9};
                        int contarPares = 0;

                        for (int num : array1) {
                            if (num % 2 == 0) {
                                contarPares++;
                            }
                        }
                        System.out.println("Cantidad de números pares en el array: " + contarPares);
                    }

                    case 2 -> {
                        int[] array2 = {1, 4, 2, 7, 3};
                        int sumaPares = array2[0] + array2[2] + array2[4];

                        System.out.println("Suma de elementos en posiciones pares: " + sumaPares);
                    }

                    case 3 -> {
                        String[] nombres = new String[4];

                        System.out.println("Ingresa 4 nombres:");
                        for (int i = 0; i < nombres.length; i++) {
                            nombres[i] = scanner.next();
                        }
                        Arrays.sort(nombres);
                        System.out.println("Nombres ordenados alfabéticamente:");
                        for (String nombre : nombres) {
                            System.out.println(nombre);
                        }
                    }

                    default ->
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
