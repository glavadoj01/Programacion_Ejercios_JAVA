package ejercicio6;

public class Furgoneta extends Vehiculo {
    private int capacidadLitros;
    private int cargaMaxima;

    public Furgoneta(String matricula, String marca, String modelo, double tarifa, int capacidadLitros, int cargaMaxima) {
        super(matricula, marca, modelo, tarifa);
        this.capacidadLitros = capacidadLitros;
        this.cargaMaxima = cargaMaxima;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }
    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }
    public int getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        return "\nFurgoneta {" + super.toString() +
                "\nCapacidad (Litros) = " + capacidadLitros +
                "\nCarga Máxima = " + cargaMaxima +
                '}';
    }
}
