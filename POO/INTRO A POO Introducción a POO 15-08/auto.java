
import java.util.Scanner;

class Auto {

    String marca;
    String modelo;
    int año;

    Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = -1;
    }

    Auto(String marca) {
        this.marca = marca;
        this.modelo = "Desconocido";
        this.año = -1;
    }

    Auto() {
        this.marca = "Desconocido";
        this.modelo = "Desconocido";
        this.año = -1;
    }

    void imprimirDatos() {
        System.out.print("Marca: " + (marca.equals("Desconocido") ? "No especificado" : marca));
        System.out.print(", Modelo: " + (modelo.equals("Desconocido") ? "No especificado" : modelo));
        System.out.println(", Año: " + (año == -1 ? "No especificado" : año));
    }
}

public class auto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = null;

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Crear auto con marca, modelo y año");
            System.out.println("2. Crear auto con marca y modelo");
            System.out.println("3. Crear auto con solo la marca");
            System.out.println("4. Crear auto sin especificar atributos");
            System.out.println("5. Imprimir datos del auto");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa la marca: ");
                    String marca1 = scanner.nextLine();
                    System.out.print("Ingresa el modelo: ");
                    String modelo1 = scanner.nextLine();
                    System.out.print("Ingresa el año: ");
                    int año1 = scanner.nextInt();
                    auto = new Auto(marca1, modelo1, año1);
                }
                case 2 -> {
                    System.out.print("Ingresa la marca: ");
                    String marca2 = scanner.nextLine();
                    System.out.print("Ingresa el modelo: ");
                    String modelo2 = scanner.nextLine();
                    auto = new Auto(marca2, modelo2);
                }
                case 3 -> {
                    System.out.print("Ingresa la marca: ");
                    String marca3 = scanner.nextLine();
                    auto = new Auto(marca3);
                }
                case 4 ->
                    auto = new Auto();
                case 5 -> {
                    if (auto != null) {
                        auto.imprimirDatos();
                    } else {
                        System.out.println("No has creado ningún auto.");
                    }
                }
                case 6 -> {
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Opción no válida.");
            }
        }
    }
}
