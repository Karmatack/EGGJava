import java.util.Scanner;

public class Concatenar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite tu nombre:");
        String nombre = scanner.nextLine();
        
        System.out.println("Digite tu apellido:");
        String apellido = scanner.nextLine();
        
        String nombreCompleto = nombre.concat(" ").concat(apellido);
        //String nombreCompleto = nombre + " " + apellido;
        
        System.out.println("Tu nombre completo es: " + nombreCompleto);
        
        scanner.close();
    }
}
