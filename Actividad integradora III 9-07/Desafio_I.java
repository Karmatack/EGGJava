import java.util.Scanner;

public class Desafio_I {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                
                System.out.print("Ingrese la temperatura: ");
                double temperatura = scanner.nextDouble();

                System.out.print("Ingrese la unidad de medida (C/F): ");
                String tipo = scanner.next().toUpperCase();
                
                if (tipo.equals("C")) {
                    if (temperatura < -273.15) {
                        System.out.println("Error: La temperatura no puede ser menor que -273.15 grados Celsius.");
                        return;
                    }
                } else if (tipo.equals("F")) {
                    if (temperatura < -459.67) {
                        System.out.println("Error: La temperatura no puede ser menor que -459.67 grados Fahrenheit.");
                        return;
                    }
                }
                switch (tipo) {
                    case "C" -> {
                        double fahrenheit = (temperatura * 9 / 5) + 32;
                        System.out.printf("%.2f grados Celsius equivale a %.2f grados Fahrenheit.\n", temperatura, fahrenheit);
                    }
                    case "F" -> {
                        double celsius = (temperatura - 32) * 5 / 9;
                        System.out.printf("%.2f grados Fahrenheit equivale a %.2f grados Celsius.\n", temperatura, celsius);
                    }
                    default -> System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
            }
        }
    }
}
