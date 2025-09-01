package examen;

public class Main {
    public static void main(String[] args) {
        Operativa op = new Operativa();
        op.cargaDatosFicheros();
        op.ejecutaInsertar();
        op.ejecutaActualizar();
        op.ejecutaConsulta();
        op.creaMapa();
    }
}
