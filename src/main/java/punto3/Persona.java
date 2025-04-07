package punto3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    static ArrayList<Persona> segunCriterio(List<Persona> personas, Predicate<Persona> p) {
        ArrayList<Persona> resultado = new ArrayList<Persona>();
        for (Persona persona : personas) {
            if (p.test(persona)) {
                resultado.add(persona);
            }

        }
        return resultado;
    }

    static void imprimirDatosPersonales(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public String nombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }


    //Métodos del profesor

    //filtra la lista de personas devolviendo otra lista con
//solo aquellas cuyo nombre comienza con E
    public List<Persona> nombresQueEmpiezanConE(List<Persona> p) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : p) {
            if (persona.nombre().startsWith("E")) {
                resultado.add(persona);
            }
        }
        return resultado;
    }

    public List<Persona> nombresCuyaCantidadDeLetrasEsPar(List<Persona> p) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : p) {
            if (persona.nombre().length() % 2 == 0) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
}


