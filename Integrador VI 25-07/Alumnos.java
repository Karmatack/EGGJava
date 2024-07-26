
import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int capacidad = 100;
            String[] nombres = new String[capacidad];
            Double[] notas = new Double[capacidad];
            int num_Alumnos = 0;
            boolean salir = false;

            while (!salir) {
                System.out.println("""
                                               Menú de opciones:
                                               1. Registrar alumno
                                               2. Mostrar todos los alumnos
                                               3. Mostrar promedio de notas
                                               4. Buscar alumno por nombre
                                               5. Modificar nota por nombre
                                               6. Eliminar alumno por nombre
                                               7. Salir
                                               Elige una opción: """);

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> {
                        if (num_Alumnos < capacidad) {
                            System.out.println("*************************************************************");
                            System.out.print("Digite el nombre del alumno: ");
                            String nombre = scanner.nextLine();
                            while (nombre.isEmpty()) {
                                System.out.print("El nombre no puede estar vacío. Digite el nombre del alumno: ");
                                nombre = scanner.nextLine();
                            }
                            System.out.print("Digite la nota del alumno (0.00 - 10.00): ");
                            double nota = scanner.nextDouble();
                            while (nota < 0.00 || nota > 10.00) {
                                System.out.print("Nota inválida. Digite la nota del alumno (0.00 - 10.00): ");
                                nota = scanner.nextDouble();
                            }
                            scanner.nextLine();
                            nombres[num_Alumnos] = nombre;
                            notas[num_Alumnos] = nota;
                            num_Alumnos++;
                        } else {
                            System.out.println("Capacidad máxima de alumnos alcanzada.");
                        }
                        System.out.println("*************************************************************\n");
                    }

                    case 2 -> {
                        System.out.println("Lista de alumnos registrados:");
                        for (int i = 0; i < num_Alumnos; i++) {
                            System.out.println("*************************************************************");
                            System.out.println("Número de alumno:" + (i + 1) + "\nNombre: " + nombres[i] + "\nNota: " + notas[i]);
                            System.out.println("*************************************************************\n");
                        }
                    }

                    case 3 -> {
                        System.out.println("*************************************************************");
                        if (num_Alumnos > 0) {
                            double suma_Notas = 0;
                            for (int i = 0; i < num_Alumnos; i++) {
                                suma_Notas += notas[i];
                            }
                            double promedio = suma_Notas / num_Alumnos;
                            System.out.println("El promedio de notas es: " + promedio);
                        } else {
                            System.out.println("No hay alumnos registrados.");
                        }
                        System.out.println("*************************************************************\n");
                    }

                    case 4 -> {
                        System.out.println("*************************************************************");
                        System.out.print("Digite el nombre del alumno a buscar: ");
                        String nombre_Buscar = scanner.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < num_Alumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombre_Buscar)) {
                                System.out.println("\nNombre: " + nombres[i] + "\nNota: " + notas[i]);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        System.out.println("*************************************************************\n");
                    }

                    case 5 -> {
                        System.out.println("*************************************************************");
                        System.out.print("Digite el nombre del alumno para modificar su nota: ");
                        String nombreModificar = scanner.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < num_Alumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreModificar)) {
                                System.out.print("Digite la nueva nota del alumno (0.00 - 10.00): ");
                                double nuevaNota = scanner.nextDouble();
                                while (nuevaNota < 0.00 || nuevaNota > 10.00) {
                                    System.out.print("Nota inválida. Digite la nueva nota del alumno (0.00 - 10.00): ");
                                    nuevaNota = scanner.nextDouble();
                                }
                                scanner.nextLine(); // Limpiar el buffer
                                notas[i] = nuevaNota;
                                System.out.println("Nota modificada exitosamente.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        System.out.println("*************************************************************\n");
                    }

                    case 6 -> {
                        System.out.println("*************************************************************");
                        System.out.print("Digite el nombre del alumno a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < num_Alumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreEliminar)) {
                                for (int j = i; j < num_Alumnos - 1; j++) {
                                    nombres[j] = nombres[j + 1];
                                    notas[j] = notas[j + 1];
                                }
                                num_Alumnos--;
                                System.out.println("Alumno eliminado exitosamente.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        System.out.println("*************************************************************\n");
                    }

                    case 7 ->
                        salir = true;

                    default ->
                        System.out.println("Opción no válida.");
                }
            }
        } // Capacidad máxima de alumnos
    }
}
