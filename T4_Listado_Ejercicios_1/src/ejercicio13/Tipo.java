package ejercicio13;

import ejercicio9.Funcion;

public enum Tipo {
    pintura ("Pintura"),
    herramienta("Herramienta"),
    recambio("Recambio"),
    cinta("Cinta"),
    tornilleria("Tornillería"),
    plomeria("Plomería");

    private final String name;

    Tipo(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public static boolean esUnTipo(String entrada) {
        try {
            Tipo.valueOf(entrada.toLowerCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static void mostrarTipos() {
        for (Tipo existe : Tipo.values()) {
            System.out.println(existe.getName());
        }
    }
}
