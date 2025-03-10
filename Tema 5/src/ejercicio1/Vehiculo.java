package ejercicio1;

/*
Vehículo tiene los atributos matrícula, marca, modelo, tarifa y disponible.
Todos String salvo tarifa que es double y disponible boolean.
Métodos: constructor, getters y setters.
*/

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private double tarifa;
    boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifa = tarifa;
        disponible = true;
    }
    public Vehiculo(String matricula, double tarifa) {
        this.matricula = matricula;
        this.tarifa = tarifa;
        disponible = true;
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
        return "Vehiculo{ " +
                "Matricula = " + matricula + "\t; " +
                "Marca='" + marca + "\t; " +
                "Modelo='" + modelo + "\t; " +
                "Tarifa=" + tarifa + "\t; " +
                "Disponible=" + disponible + '}';
    }
}
