
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("""
                    \nMenú de Actividades:
                    1. Copiar parte de un arreglo
                    2. Rellenar un arreglo
                    3. Salir
                    Selecciona una opción: """);

                try {
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1 -> {
                            System.out.print("Tamaño del arreglo: ");
                            int tamano = scanner.nextInt();
                            int[] arregloOriginal = new int[tamano];
                            for (int i = 0; i < arregloOriginal.length; i++) {
                                arregloOriginal[i] = (int) (Math.random() * 100) + 1;
                            }
                            System.out.println("Arreglo original: " + Arrays.toString(arregloOriginal));

                            System.out.print("Introduce el índice inicial: ");
                            int indiceInicial = scanner.nextInt();
                            System.out.print("Introduce el índice final: ");
                            int indiceFinal = scanner.nextInt();

                            if (indiceInicial >= 0 && indiceFinal < arregloOriginal.length && indiceInicial <= indiceFinal) {
                                int[] nuevoArreglo = Arrays.copyOfRange(arregloOriginal, indiceInicial, indiceFinal + 1);
                                System.out.println("Nuevo arreglo copiado: " + Arrays.toString(nuevoArreglo));
                            } else {
                                System.out.println("Error: Índices inválidos.");
                            }
                        }

                        case 2 -> {
                            System.out.print("Tamaño del arreglo: ");
                            int tamano = scanner.nextInt();
                            int[] arregloRelleno = new int[tamano];
                            System.out.print("Introduce el número con el que quieres rellenar el arreglo: ");
                            int valorRelleno = scanner.nextInt();
                            Arrays.fill(arregloRelleno, valorRelleno);
                            System.out.println("Arreglo rellenado: " + Arrays.toString(arregloRelleno));
                        }

                        case 3 ->
                            System.out.println("Saliendo...");

                        default ->
                            System.out.println("Opción inválida. Intenta de nuevo.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, ingresa un número válido.");
                    scanner.next();
                    opcion = 0;
                }
            } while (opcion != 3);
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}
