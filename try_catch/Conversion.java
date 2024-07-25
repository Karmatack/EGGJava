import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese la cadena que represente un número entero:");
            String cadena = scanner.nextLine();

            int numero = Integer.parseInt(cadena);
            System.out.println("El número entero ingresado es: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("La cadena no pudo ser convertida a un número entero.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}