
import java.util.Scanner;

public class complementarios {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            int numero;
            int pares;
            int impares;
            int suma;
            char continuar;

            do {
                System.out.print("""
                                               Elige una opción:
                                               1. Tabla de multiplicar de un número
                                               2. Contador de números pares e impares
                                               3. Calculadora de suma acumulada de números positivos
                                               4. Salir
                                               Opción: """);
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> {
                        do {
                            System.out.print("Ingresa un número entero para la tabla de multiplicar (0 para salir): ");
                            numero = scanner.nextInt();
                            scanner.nextLine();

                            if (numero != 0) {
                                System.out.println("****************************************");
                                System.out.println("Tabla de multiplicar de " + numero + ":");
                                for (int i = 1; i <= 10; i++) {
                                    System.out.println(numero + " x " + i + " = " + (numero * i));
                                }
                                System.out.println("****************************************\n");
                            }
                        } while (numero != 0);
                    }

                    case 2 -> {
                        pares = 0;
                        impares = 0;
                        System.out.println("Ingresa una serie de números enteros (0 para terminar):");

                        do {
                            System.out.print("Número: ");
                            numero = scanner.nextInt();
                            scanner.nextLine();

                            if (numero != 0) {
                                if (numero % 2 == 0) {
                                    pares++;
                                } else {
                                    impares++;
                                }
                            }
                        } while (numero != 0);

                        System.out.println("Cantidad de pares: " + pares);
                        System.out.println("Cantidad de impares: " + impares + "\n");
                    }

                    case 3 -> {
                        suma = 0;
                        do {
                            System.out.print("Ingresa un número entero positivo para sumar (0 para terminar): ");
                            numero = scanner.nextInt();
                            scanner.nextLine();

                            if (numero > 0) {
                                suma += numero;
                                System.out.print("¿Deseas ingresar otro número? (s/n): ");
                                continuar = scanner.nextLine().charAt(0);
                            } else {
                                continuar = 'n';
                            }
                        } while (continuar == 's' || continuar == 'S');

                        System.out.println("La suma es: " + suma + "\n");
                    }

                    case 4 ->
                        System.out.println("Saliendo del programa.");

                    default ->
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcion != 4);
        }
    }
}
