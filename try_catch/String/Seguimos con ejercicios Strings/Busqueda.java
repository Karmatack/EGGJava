import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite una palabra:");
        String palabra = scanner.nextLine();
        
        System.out.println("Digite un carácter:");
        char caracter = scanner.next().charAt(0);
        
        if (palabra.indexOf(caracter) != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la palabra.");
        } else {
            System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
        }
        
        scanner.close();
    }
}
