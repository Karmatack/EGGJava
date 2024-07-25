import java.util.Random;
import java.util.Scanner;

public class  Practicando_con_clase_Math {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            System.out.println("""
                                    Seleccione una actividad:
                                    1. Calcular el valor absoluto
                                    2. Redondear un número
                                    3. Generar un número aleatorio (1-1000)
                                    """);
            int option = scanner.nextInt();
            
            switch (option) {
                case 1 -> {
                    System.out.println("Ingrese un número entero:");
                    int number = scanner.nextInt();
                    System.out.println("El valor absoluto es: " + Math.abs(number));
                }
                
                case 2 -> {
                    System.out.println("Ingrese un número decimal:");
                    double decimalNumber = scanner.nextDouble();
                    System.out.println("El número redondeado es: " + Math.round(decimalNumber));
                }
                
                case 3 -> {
                    System.out.println("El número aleatorio es: " + 1 + random.nextInt(1000));
                }
                
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
