
import java.util.Scanner;

public class ContarOcurrenciasForEach {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Escriba una frase: ");
            String frase = scanner.nextLine();
            char[] fraseArray = frase.toCharArray();    // recogemos la frase y la asignamos en el array de caracteres

            System.out.print("Ingrese el carácter a buscar: ");
            char caracterObjetivo = scanner.next().charAt(0);   // charAt sirve para agarrar solo la posición elegida, 0 es el primero

            int contador = 0;
            for (char c : fraseArray) {
                if (c == caracterObjetivo) {
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.printf("El carácter \"%c\" aparece %d veces.\n", caracterObjetivo, contador);
            } else {
                System.out.printf("El carácter \"%c\" no aparece en la frase.\n", caracterObjetivo);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
