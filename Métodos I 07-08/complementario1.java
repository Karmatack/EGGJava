
import java.util.Scanner;

public class complementario1 {

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);
    }

    public static int pedirNumero() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite un número:");
            int numero = scanner.nextInt();
            scanner.close();
            return numero;
        }
    }

    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
