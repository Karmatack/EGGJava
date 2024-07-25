import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random random = new Random();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("""
                                Seleccione una actividad:
                                1. Generar número aleatorio entre 2 números
                                2. Generación aleatoria y análisis de raíz cuadrada
                                """);

            int option = scanner.nextInt();

            switch (option) {

                case 1 -> {

                    System.out.println("Ingrese el límite inferior :");
                    int numero1 = scanner.nextInt();
                    System.out.println("Ingrese el límite superior :");
                    int numero2 = scanner.nextInt();
                    if (numero1 >numero2 ) {
                        System.out.println("el límite inferior es mayor que el límite superior.");
                    }
                    else{
                        System.out.println("El número aleatorio es: " + numero1 + random.nextInt(numero2 - numero1 + 1));
                    }
                    
                }

                case 2 -> {

                    System.out.println("Ingrese un número entre 1 y 30:");
                    int numeroLimite = scanner.nextInt();
                    if (numeroLimite < 1 || numeroLimite > 30) {
                        System.out.println("El número debe de estar entre 1 y 30.");
                        return;
                    }
        
                    int numeroAleatorio = 1 + random.nextInt(numeroLimite);

                    double raizCuadrada = Math.sqrt(numeroAleatorio);
        
                    boolean esPrimo = true;
                    if (numeroAleatorio < 2) {
                        esPrimo = false;
                    } else {
                        for (int i = 2; i <=Math.sqrt(numeroAleatorio); i++) {
                            if (numeroAleatorio % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }
                    }
        
                    // Mostrar resultados
                    System.out.println("Número aleatorio generado: " + numeroAleatorio);
                    System.out.println("Raíz cuadrada del número aleatorio: " + raizCuadrada);
                    if (esPrimo) {
                        System.out.println("El número aleatorio generado es primo.");
                    } else {
                        System.out.println("El número aleatorio generado no es primo.");
                    }

                }

                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
