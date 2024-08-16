
import java.util.Scanner;

class Rectangulo {

    private double ancho;
    private double alto;
    private static int contadorRectangulos = 0;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }

    public void imprimirArea() {
        System.out.println("Área del rectángulo: " + area());
    }

    public void imprimirPerimetro() {
        System.out.println("Perímetro del rectángulo: " + perimetro());
    }

    public static int getTotalRectangulos() {
        return contadorRectangulos;
    }
}

public class rectangulo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Rectangulo[] rectangulos = new Rectangulo[100];
            int indice = 0;

            while (true) {
                System.out.println("\nMenú:");
                System.out.println("1. Crear un rectángulo");
                System.out.println("2. Ver área del último rectángulo creado");
                System.out.println("3. Ver perímetro del último rectángulo creado");
                System.out.println("4. Ver total de rectángulos creados");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el ancho del rectángulo: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Ingresa el alto del rectángulo: ");
                        double alto = scanner.nextDouble();
                        rectangulos[indice] = new Rectangulo(ancho, alto);
                        indice++;
                        break;
                    case 2:
                        if (indice > 0) {
                            rectangulos[indice - 1].imprimirArea();
                        } else {
                            System.out.println("No se ha creado ningún rectángulo.");
                        }
                        break;
                    case 3:
                        if (indice > 0) {
                            rectangulos[indice - 1].imprimirPerimetro();
                        } else {
                            System.out.println("No se ha creado ningún rectángulo.");
                        }
                        break;
                    case 4:
                        System.out.println("Total de rectángulos creados: " + Rectangulo.getTotalRectangulos());
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            }
        }
    }
}
