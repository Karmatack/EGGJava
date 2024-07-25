
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioV {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] oracion = new String[0];
            int opcion = -1; // Inicializa opcion

            do {
                System.out.print("""
                                             \nMenú de opciones:
                                             1. Crear oración o Borrar oración
                                             2. Cantidad de caracteres de la oración
                                             3. Cantidad de palabras de la oración
                                             4. Mostrar palabras ordenadas alfabéticamente
                                             5. Ingresar un número y devolver la palabra correspondiente
                                             6. Buscar palabra dentro de la oración
                                             7. Modificar palabra dentro de la oración
                                             8. Agregar contenido a la oración
                                             9. Salir
                                             Digite una opción: """);
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("");

                    switch (opcion) {
                        case 1 -> {     //Crear oración o Borrar oración
                            if (oracion.length == 0) {
                                System.out.print("Digite la nueva oración: ");
                                String nueva_Oracion = scanner.nextLine();
                                oracion = nueva_Oracion.split(" ");
                            } else {
                                oracion = new String[0];
                                System.out.println("Oración borrada.");
                            }
                        }
                        case 2 -> {     //Cantidad de caracteres de la oración
                            int caracteres = 0;
                            for (String palabra : oracion) {
                                caracteres += palabra.length();
                            }
                            caracteres += oracion.length - 1;
                            System.out.println("La cantidad de caracteres es: " + caracteres);
                        }
                        case 3 ->       //Cantidad de palabras de la oración
                            System.out.println("La cantidad de palabras es: " + oracion.length);
                        case 4 -> {     //Mostrar palabras ordenadas alfabéticamente
                            String[] ordenar_Palabras = Arrays.copyOf(oracion, oracion.length);
                            Arrays.sort(ordenar_Palabras);
                            System.out.println("Palabras : " + Arrays.toString(oracion));
                            System.out.println("Palabras ordenadas alfabéticamente: " + Arrays.toString(ordenar_Palabras));
                        }
                        case 5 -> {     //Ingresar un número y devolver la palabra correspondiente
                            System.out.print("Ingrese un número: ");
                            int numero = scanner.nextInt();
                            scanner.nextLine();  // Consumir la nueva línea
                            if (numero > 0 && numero <= oracion.length) {
                                System.out.println("Palabra correspondiente: " + oracion[numero - 1]);
                            } else {
                                System.out.println("Número inválido. Intente nuevamente.");
                            }
                        }
                        case 6 -> {     //Buscar palabra dentro de la oración
                            System.out.print("Ingrese la palabra a buscar: ");
                            String palabra_Buscada = scanner.nextLine();
                            int posicion = -1;
                            for (int i = 0; i < oracion.length; i++) {
                                if (oracion[i].equals(palabra_Buscada)) {
                                    posicion = i;
                                    break;
                                }
                            }
                            if (posicion != -1) {
                                System.out.println("Palabra encontrada en la posición: " + (posicion + 1));
                            } else {
                                System.out.println("Palabra no encontrada.");
                            }
                        }
                        case 7 -> {     //Modificar palabra dentro de la oración
                            System.out.print("Ingrese la palabra que desea modificar: ");
                            String palabra_Modificar = scanner.nextLine();
                            int index = -1;
                            for (int i = 0; i < oracion.length; i++) {
                                if (oracion[i].equals(palabra_Modificar)) {
                                    index = i;
                                    break;
                                }
                            }
                            if (index != -1) {
                                System.out.print("Ingrese la nueva palabra: ");
                                String nueva_Palabra = scanner.nextLine();
                                oracion[index] = nueva_Palabra;
                                System.out.println("Oración modificada: " + Arrays.toString(oracion));
                            } else {
                                System.out.println("Palabra no encontrada. Intente nuevamente.");
                            }
                        }
                        case 8 -> {     //Agregar contenido a la oración
                            System.out.print("Ingrese el contenido a agregar: ");
                            String contenido_Agregar = scanner.nextLine();
                            String[] palabras_Agregar = contenido_Agregar.split(" ");
                            String[] nueva_Oracion = new String[oracion.length + palabras_Agregar.length];
                            for (int i = 0; i < oracion.length; i++) {
                                nueva_Oracion[i] = oracion[i];
                            }
                            for (int i = 0; i < palabras_Agregar.length; i++) {
                                nueva_Oracion[oracion.length + i] = palabras_Agregar[i];
                            }
                            oracion = nueva_Oracion;
                            System.out.println("Oración actualizada: " + Arrays.toString(oracion));
                        }
                        case 9 ->       //Salir
                            System.out.println("Saliendo del programa.\n");
                        default ->      //Por defecto
                            System.out.println("Opción inválida. Intente nuevamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor ingrese un número.");
                    scanner.nextLine();
                    opcion = -1;
                } catch (Exception e) {
                    System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                    e.printStackTrace(); // Para depuración
                }
            } while (opcion != 9);
        }
    }
}
