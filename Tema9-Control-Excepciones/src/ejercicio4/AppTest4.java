package ejercicio4;

import tema9.recursoscomunes.PosicionOcupada;

public class AppTest4 {
    public static void main(String[] args) {
        Gestion g = new Gestion();

        Persona p1 = new Persona("1","Angustias");
        Persona p2 = new Persona("2","Boris");
        Persona p3 = new Persona("3","Claudia");

        System.out.println("*******************************");
        System.out.println("Añadir posición 0: " + p1);
        try {
            g.anadirPersona(0,p1);
        } catch (PosicionOcupada e) {
            System.out.println(e.getMessage());
        }

        System.out.println("*******************************");
        System.out.println("Añadir posición 1: " + p2);
        try {
            g.anadirPersona(1,p2);
        } catch (PosicionOcupada e) {
            System.out.println(e.getMessage());
        }

        System.out.println("*******************************");
        System.out.println("Añadir posición 0: " + p3);
        try {
            g.anadirPersona(0,p3);
        } catch (PosicionOcupada e) {
            System.out.println(e.getMessage());
        }

        System.out.println("*******************************");
        System.out.println("Estado final");
        for (Persona p : g.getListaP()) {
            System.out.println(p);
        }
    }
}
