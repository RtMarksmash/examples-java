public class Ejemplo4 {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", "Pérez", 30);
        Persona persona2 = new Persona("María", "Gómez", 25);

        System.out.println("Persona 1: " + persona1.nombre + " " + persona1.apellido + ", Edad: " + persona1.edad);
        System.out.println("Persona 2: " + persona2.nombre + " " + persona2.apellido + ", Edad: " + persona2.edad);
    }
    
}
