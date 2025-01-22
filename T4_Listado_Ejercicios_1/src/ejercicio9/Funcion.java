package ejercicio9;

public enum Funcion {
    SO("Sistema Operativo (SO)"),
    SERVER("Servidor de Bases de Datos (SERVER)"),
    OFIMA("Ofimática (OFIMA)"),;

    private final String name;

    Funcion(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static boolean esFuncionPrograma(String entrada) {
        try {
            Funcion.valueOf(entrada.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static void mostrarFunciones() {
        for (Funcion funcion : Funcion.values()) {
            System.out.println(funcion.getName());
        }
    }
}
