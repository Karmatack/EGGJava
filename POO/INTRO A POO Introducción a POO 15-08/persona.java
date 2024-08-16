
class Persona {

    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class persona {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 25);
        persona1.imprimirDatos();

        Persona persona2 = new Persona("María", 30);
        persona2.imprimirDatos();
    }
}
