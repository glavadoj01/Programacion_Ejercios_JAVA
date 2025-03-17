package ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        List<Persona> gente = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            gente.add(new Persona(String.valueOf(11-i),"Persona "+i, LocalDate.of((1990+i),i,i)));
        }
        // Persona Adicional con valores extremos para las distintas ordenaciones.
        gente.add(new Persona("0","Persona 3", LocalDate.of(1991,1,1)));

        System.out.println("Orden Natural (Edad, El más mayor 1º)");
        Collections.sort(gente);
        for (Persona persona : gente) {
            System.out.println(persona);
        }

        System.out.println("\n\n**********\n\nOrden Natural Inverso (Más joven 1º)");
        Collections.reverse(gente);
        for (Persona persona : gente) {
            System.out.println(persona);
        }


        System.out.println("\n\n**********\n\nOrden por Nombre + Fecha");
        Collections.sort(gente, new Criterio());
        for (Persona persona : gente) {
            System.out.println(persona);
        }

    }
}
