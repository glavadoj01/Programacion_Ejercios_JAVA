package ejercicio15;

public enum Estados {
    ALMACEN("Almacén"),
    REPARTO("Reparto"),
    ENTREGADO("Entregado");

    private final String nombreEstado;

    Estados(String nombre) {
        this.nombreEstado = nombre;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public static boolean esUnEstado(String estado) {
        for (Estados tipoDeEstado : Estados.values()) {
            if (tipoDeEstado.getNombreEstado().equalsIgnoreCase(estado)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarEstado() {
        for (Estados existe : Estados.values()) {
            System.out.println(existe.getNombreEstado());
        }
    }

    @Override
    public String toString() {
        return nombreEstado;
    }
}
