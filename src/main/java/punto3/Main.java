package punto3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Ezequiel", "Gonzalez");
        Persona p2 = new Persona("Juan", "Lopez");
        Persona p3 = new Persona("Pedro", "Gonzalez");
        Persona p4 = new Persona("Emilia", "Lopez");
        Persona p5 = new Persona("Ana", "Gonzalez");


        var personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        var personasConNombrePar = Persona.segunCriterio(personas, p -> p.nombre().length() % 2 == 0);

        System.out.println(" ");
        System.out.println("Lista de personas cuyo nombre es par: ");
        Persona.imprimirDatosPersonales(personasConNombrePar);
        System.out.println(" ");

        var vocal = "E";
        var nombreEmpiezaConE = Persona.segunCriterio(personas, p -> p.nombre().startsWith(vocal));
        
        System.out.println(" ");
        System.out.println("Lista de personas cuyo nombre empieza con la vocal " + vocal);
        Persona.imprimirDatosPersonales(nombreEmpiezaConE);

    }
}

