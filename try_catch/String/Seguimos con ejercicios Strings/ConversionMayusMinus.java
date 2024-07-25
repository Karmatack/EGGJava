import java.util.Scanner;

public class ConversionMayusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite una cadena de texto:");
        String cadena = scanner.nextLine();
        
        System.out.println("Elige una opción:");
        System.out.println("1. Convertir a mayúsculas");
        System.out.println("2. Convertir a minúsculas");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1 -> {
                String mayusculas = cadena.toUpperCase();
                System.out.println("Cadena en mayúsculas: " + mayusculas);
            }
            case 2 -> {
                String minusculas = cadena.toLowerCase();
                System.out.println("Cadena en minúsculas: " + minusculas);
            }
            default -> System.out.println("Opción no válida.");
        }
        
        scanner.close();
    }
}
