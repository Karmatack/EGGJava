
import java.util.Scanner;

public class complementario2 {

    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirTablasMultiplicar(numeros);
    }

    public static int[] pedirNumeros() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Digite el número " + (i + 1) + ":");
                numeros[i] = scanner.nextInt();
            }
            scanner.close();
            return numeros;
        }
    }

    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println();
        }
    }
}
