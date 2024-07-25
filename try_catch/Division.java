import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer valor:");
            double numero1 = scanner.nextInt();

            System.out.println("Ingrese el segundo valor:");
            double numero2 = scanner.nextInt();
            if(numero2==0){
                System.out.println("No se puede dividir por cero.");
            }else System.out.println("El resultado es: " + numero1 / numero2 );
            
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
