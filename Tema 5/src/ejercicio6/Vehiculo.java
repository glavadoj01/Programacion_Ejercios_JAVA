package ejercicio6;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, double tarifa) {
        super();
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifa = tarifa;
        this.disponible = true;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "\nMatricula = " + matricula +
                "\nMarca = " + marca +
                "\nModelo = " + modelo +
                "\nTarifa = " + tarifa +
                "\nDisponible = " + disponible;
    }
}
