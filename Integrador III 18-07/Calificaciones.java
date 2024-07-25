
import java.util.Random;

public class Calificaciones {

    public static void main(String[] args) {
        int 10 = 20; // Número de calificaciones a generar
        String[] calificaciones = new String[10];
        Random random = new Random();

        // Generar calificaciones aleatorias entre 0 y 20
        for (int i = 0; i < 10; i++) {
            calificaciones[i] = String.format("%.2f", random.nextDouble() * 20); // Calificaciones entre 0.00 y 20.00
        }

        // Inicializar arreglos para las categorías
        String[] desaprobado = new String[10];
        String[] aprobado = new String[10];
        String[] excelente = new String[10];

        int countDesaprobado = 0, countAprobado = 0, countExcelente = 0;

        // Separar calificaciones en categorías
        for (String calificacionStr : calificaciones) {
            double calificacion = Double.parseDouble(calificacionStr);
            if (calificacion >= 10) {
                excelente[countExcelente++] = calificacionStr;
            } else if (calificacion >= 4) {
                aprobado[countAprobado++] = calificacionStr;
            } else {
                desaprobado[countDesaprobado++] = calificacionStr;
            }
        }

        // Crear arreglos finales con tamaño exacto
        desaprobado = trimArray(desaprobado, countDesaprobado);
        aprobado = trimArray(aprobado, countAprobado);
        excelente = trimArray(excelente, countExcelente);

        // Calcular y mostrar promedios
        double promedioOriginal = calcularPromedio(calificaciones);
        double promedioDesaprobado = calcularPromedio(desaprobado);
        double promedioAprobado = calcularPromedio(aprobado);
        double promedioExcelente = calcularPromedio(excelente);

        // Imprimir resultados
        System.out.println("Calificaciones originales: ");
        imprimirArray(calificaciones);

        System.out.println("\nDesaprobado: ");
        imprimirArray(desaprobado);
        System.out.println("Promedio Desaprobado: " + promedioDesaprobado);

        System.out.println("\nAprobado: ");
        imprimirArray(aprobado);
        System.out.println("Promedio Aprobado: " + promedioAprobado);

        System.out.println("\nExcelente: ");
        imprimirArray(excelente);
        System.out.println("Promedio Excelente: " + promedioExcelente);

        System.out.println("\nPromedio General: " + promedioOriginal);
    }

    private static String[] trimArray(String[] array, int length) {
        String[] newArray = new String[length];
        System.arraycopy(array, 0, newArray, 0, length);
        return newArray;
    }

    private static double calcularPromedio(String[] array) {
        double suma = 0;
        int count = 0;

        for (String str : array) {
            if (str != null) {
                suma += Double.parseDouble(str);
                count++;
            }
        }

        return count > 0 ? suma / count : 0;
    }

    private static void imprimirArray(String[] array) {
        for (String str : array) {
            if (str != null) {
                System.out.print(str + " ");
            }
        }
        System.out.println();
    }
}
