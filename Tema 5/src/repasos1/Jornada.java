package repasos1;

public enum Jornada {
    manana("Mañana"),
    tarde("Tarde");

    private final String tipoJornada;

    Jornada(String tipoJornada) {this.tipoJornada = tipoJornada;}
    public String getTipoJornada() {return tipoJornada;}

    public boolean esTipoJornada(String tipoJornada) {
        try {
            Jornada.valueOf(tipoJornada);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public void mostrarJornadas() {
        for (Jornada tipoJornada : Jornada.values()) {
            System.out.println(tipoJornada.getTipoJornada());
        }
    }
}
