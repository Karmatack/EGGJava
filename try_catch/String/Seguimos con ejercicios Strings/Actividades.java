import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                           Digite el número [1-4]:
                           1. Reemplazo de Caracteres
                           2. Eliminación de Espacios en Blanco
                           3. Comparación de Cadenas
                           4. Calculando la Longitud de Cadenas sin Espacios""");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                scanner.nextLine();
                System.out.println("Digite una frase:");
                String frase1 = scanner.nextLine();

                System.out.println("Digite la primera palabra:");
                String caracter1 = scanner.next(); 

                System.out.println("Digite la segunda palabra:");
                String caracter2 = scanner.next();

                System.out.println("Frase modificada: " + frase1.replace(caracter1, caracter2));
            }

            case 2 -> {
                scanner.nextLine();

                System.out.println("Digite una frase:");
                String frase2 = scanner.nextLine();

                System.out.println("Frase sin espacios en blanco: " + frase2.replace(" ", ""));
            }

            case 3 -> {
                scanner.nextLine();
                System.out.println("Ingrese la primera palabra:");
                String palabra1 = scanner.nextLine();

                System.out.println("Ingrese la segunda palabra:");
                String palabra2 = scanner.nextLine();

                System.out.println(palabra1.equals(palabra2) ? "Las palabras ingresadas son iguales." : "Las palabras ingresadas son diferentes.");
            }

            case 4 -> {
                scanner.nextLine(); 
                System.out.println("Ingrese una cadena de texto:");
                String cadena = scanner.nextLine();

                int longitudSinEspacios = 0;
                for (int i = 0; i < cadena.length(); i++) {
                    if (cadena.charAt(i) != ' ') {
                        longitudSinEspacios++;
                    }
                }

                System.out.println("Longitud sin espacios: " + longitudSinEspacios);
            }

            default -> System.out.println("Valor no válida.");
        }

        scanner.close();
    }
}
