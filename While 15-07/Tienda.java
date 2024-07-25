
import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("""
                                               Seleccione una opción del menú:
                                               1. Comprar producto
                                               2. Realizar devolución
                                               3. Ver mis pedidos
                                               4. Preguntas frecuentes
                                               5. Salir
                                               """);
                System.out.print("Ingrese su opción: ");

                opcion = scanner.nextInt();
                switch (opcion) {

                    case 1 ->
                        System.out.println("Producto añadido \n");
                    case 2 ->
                        System.out.println("Devolución realizada !! \n");
                    case 3 ->
                        System.out.println("Pedidos : a b c ");
                    case 4 ->
                        System.out.println("Lista de productos : x y z \n");
                    case 5 ->
                        System.out.println("Vuelva pronto \n");

                    default ->
                        System.out.println("Número erroneo\n");
                }

            } while (opcion != 5);
        }
    }
}
