
import java.util.Random;
import java.util.Scanner;

public class GeneradorDeContraseñas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int longitud = scanner.nextInt();

            do {
                System.out.print("\nIngresa la longitud de la contraseña (mínimo 3): ");
                longitud = scanner.nextInt();
                if (longitud < 3) {
                    System.out.println("La longitud mínima debe ser 3.");
                }
            } while (longitud < 3);

            char[] contraseña = new char[longitud];
            Random random = new Random();

            boolean contadorMayus, contadorMinus, contadorDigit;

            for (int i = 0; i < longitud; i++) {
                int tipoCaracter = random.nextInt(3);
                switch (tipoCaracter) {
                    case 0 ->
                        contraseña[i] = (char) (random.nextInt(26) + 'A');
                    case 1 ->
                        contraseña[i] = (char) (random.nextInt(26) + 'a');
                    case 2 ->
                        contraseña[i] = (char) (random.nextInt(10) + '0');
                }
            }

            do {
                contadorMayus = false;
                contadorMinus = false;
                contadorDigit = false;

                for (int i = 0; i < longitud; i++) {
                    if (Character.isUpperCase(contraseña[i])) {
                        contadorMayus = true;
                    } else if (Character.isLowerCase(contraseña[i])) {
                        contadorMinus = true;
                    } else if (Character.isDigit(contraseña[i])) {
                        contadorDigit = true;
                    }
                }

                if (!contadorMayus || !contadorMinus || !contadorDigit) {
                    int pos = random.nextInt(longitud);
                    if (!contadorMayus) {
                        contraseña[pos] = (char) (random.nextInt(26) + 'A');
                    } else if (!contadorMinus) {
                        contraseña[pos] = (char) (random.nextInt(26) + 'a');
                    } else {
                        contraseña[pos] = (char) (random.nextInt(10) + '0');
                    }
                }
            } while (!contadorMayus || !contadorMinus || !contadorDigit);

            StringBuilder contraseñaFinal = new StringBuilder();
            for (char c : contraseña) {
                contraseñaFinal.append(c);
            }

            System.out.println("Contraseña generada: " + contraseñaFinal.toString());

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
