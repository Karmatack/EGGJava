import java.util.Scanner;
public class Desafio_II {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();
            boolean mayuscula = false;
            boolean minuscula = false;
            boolean numero = false;
            boolean caracterEspecial = false;
            for (char letra : contrasena.toCharArray()) {
                if (Character.isUpperCase(letra)) {
                    mayuscula = true;
                } else if (Character.isLowerCase(letra)) {
                    minuscula = true;
                } else if (Character.isDigit(letra)) {
                    numero = true;
                } else if (!Character.isLetterOrDigit(letra)) {
                    caracterEspecial = true;
                }
            }
            if (contrasena.length() < 8) {
                System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres.");
            } else if (!mayuscula || !minuscula) {
                System.out.println("Contraseña no segura. Debe contener al menos una letra mayúscula y una minúscula.");
            } else if (!numero) {
                System.out.println("Contraseña no segura. Debe contener al menos un número.");
            } else if (!caracterEspecial) {
                System.out.println("Contraseña no segura. Debe contener al menos un carácter especial.");
            } else {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
            }
        }
    }
}
