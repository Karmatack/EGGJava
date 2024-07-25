
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseArrays {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("""
                    \nMenú de Actividades:
                    1. Ordenar en forma descendente
                    2. Búsqueda binaria
                    3. Comparar arreglos
                    4. Salir
                    Selecciona una opción: """);

                try {
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1 -> {
                            int[] arregloDescendente = new int[10];
                            for (int i = 0; i < arregloDescendente.length; i++) {
                                arregloDescendente[i] = (int) (Math.random() * 100) + 1;
                            }
                            System.out.println("Arreglo original: " + Arrays.toString(arregloDescendente));
                            Arrays.sort(arregloDescendente);
                            System.out.print("Arreglo ordenado en forma descendente: ");
                            for (int i = arregloDescendente.length - 1; i >= 0; i--) {
                                System.out.print(arregloDescendente[i] + " ");
                            }
                            System.out.println();
                        }

                        case 2 -> {
                            int[] arregloBusqueda = new int[10];
                            for (int i = 0; i < arregloBusqueda.length; i++) {
                                arregloBusqueda[i] = (int) (Math.random() * 100) + 1;
                            }
                            Arrays.sort(arregloBusqueda);
                            System.out.println("Arreglo ordenado: " + Arrays.toString(arregloBusqueda));
                            System.out.print("Introduce el valor a buscar: ");
                            int clave = scanner.nextInt();
                            int indice = Arrays.binarySearch(arregloBusqueda, clave);
                            System.out.println(indice >= 0 ? "El valor " + clave + " se encuentra en el índice: " + indice : "El valor " + clave + " no se encuentra en el arreglo.");
                        }

                        case 3 -> {
                            int[] arreglo1 = new int[5];
                            int[] arreglo2 = new int[5];
                            for (int i = 0; i < arreglo1.length; i++) {
                                arreglo1[i] = (int) (Math.random() * 100) + 1;
                                arreglo2[i] = (int) (Math.random() * 100) + 1;
                            }
                            System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
                            System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
                            System.out.println(Arrays.equals(arreglo1, arreglo2) ? "Los arreglos son iguales." : "Los arreglos no son iguales.");
                        }

                        case 4 ->
                            System.out.println("Saliendo...");

                        default ->
                            System.out.println("Opción inválida. Intenta de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, ingresa un número válido.");
                    scanner.next(); // limpiar el input inválido
                    opcion = 0; // reiniciar la opción para evitar salir del bucle
                }
            } while (opcion != 4);
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}
