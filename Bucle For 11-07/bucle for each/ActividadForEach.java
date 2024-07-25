
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ActividadForEach {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("""
                Selecciona la actividad a realizar:
                1. Contando Elementos Pares
                2. Calculando el Promedio
                3. Concatenando Elementos
                """);
            System.out.print("Digite la opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {

                    int[] array = new int[10];
                    Random random = new Random();

                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(100);
                    }

                    System.out.println("Array generado: " + Arrays.toString(array));

                    int Pares = 0;
                    for (int num : array) {
                        if (num % 2 == 0) {
                            Pares++;
                        }
                    }
                    System.out.println("El total de elementos pares es: " + Pares);
                }

                case 2 -> {

                    float[] array = new float[20];
                    Random random = new Random();

                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextFloat(100);
                    }

                    float suma = 0;
                    for (float num : array) {
                        suma += num;
                    }
                    System.out.println("Array generado: " + Arrays.toString(array));
                    System.out.println("Suma de elementos: " + suma);
                    System.out.println("Promedio de elementos: " + suma / array.length);
                }

                case 3 -> {

                    System.out.print("Ingrese la cantidad de elementos del array: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    String[] oracion = new String[n];

                    for (int i = 0; i < oracion.length; i++) {
                        System.out.print("Ingrese la cadena " + (i + 1) + ": ");
                        oracion[i] = scanner.nextLine();
                    }

                    String resultado = "";
                    for (String palabra : oracion) {
                        resultado = resultado + " " + palabra;
                    }

                    System.out.println("Cadena concatenada: \n" + resultado);
                }

                default ->
                    System.out.println("Opción no válida");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
