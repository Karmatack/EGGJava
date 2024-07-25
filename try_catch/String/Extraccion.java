import java.util.Scanner;

public class Extraccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite una frase:");
        String frase = scanner.nextLine();
        
        System.out.println("Digite el índice inicial:");
        int indiceInicial = scanner.nextInt();
        
        System.out.println("Digite el índice final:");
        int indiceFinal = scanner.nextInt();
        
        if (indiceInicial >= 0 && indiceFinal <= frase.length() && indiceInicial < indiceFinal) {
            String subcadena = frase.substring(indiceInicial, indiceFinal);
            System.out.println("La subcadena extraída es: " + subcadena);
        } else {
            System.out.println("Índices inválidos.");
        }
        
        scanner.close();
    }
}
