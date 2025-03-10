package ejercicio6;

public class Turismo extends Vehiculo {
    private int nPuertas;
    private boolean automatico;

    public Turismo(String matricula, String marca, String modelo, double tarifa, int nPuertas, boolean automatico) {
        super(matricula, marca, modelo, tarifa);
        this.nPuertas = nPuertas;
        this.automatico = automatico;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
    public boolean isAutomatico() {
        return automatico;
    }
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        return "\nTurismo =>" + super.toString() +
                "\nNº de Puertas = " + nPuertas +
                "\nAutomático = " + automatico +
                '}';
    }
}
