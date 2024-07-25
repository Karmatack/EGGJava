import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer valor:");
            int numero1 = scanner.nextInt();

            System.out.println("Ingrese el segundo valor:");
            int numero2 = scanner.nextInt();

            System.out.println("El resultado de la resta es: " + (numero1 - numero2));

        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar números válidos.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}