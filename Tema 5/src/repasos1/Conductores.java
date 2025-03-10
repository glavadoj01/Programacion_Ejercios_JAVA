package repasos1;


import java.time.LocalDate;

public class Conductores extends Trabajador {
    private String tipoCarnet;
    private LocalDate caducidadCarnet;
    private double sueldoBase;
    private double kilometros;

    public Conductores(int id, String nombre, LocalDate fechaNacimiento, String tipoCarnet, LocalDate caducidadCarnet, double kilometros) {
        super(id, nombre, fechaNacimiento);
        this.tipoCarnet = tipoCarnet;
        this.caducidadCarnet = caducidadCarnet;
        this.sueldoBase = 1400;
        this.kilometros = kilometros;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + (0.5*kilometros);
    }

    public String getTipoCarnet() {
        return tipoCarnet;
    }
    public void setTipoCarnet(String tipoCarnet) {
        this.tipoCarnet = tipoCarnet;
    }
    public LocalDate getCaducidadCarnet() {
        return caducidadCarnet;
    }
    public void setCaducidadCarnet(LocalDate caducidadCarnet) {
        this.caducidadCarnet = caducidadCarnet;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public double getKilometros() {
        return kilometros;
    }
    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "Conductor {" +
                super.toString() +
                "\nTipo de Carnet = " + getTipoCarnet() +
                "\nFecha de Caducidad Carnet = " + getCaducidadCarnet() +
                "\nSueldo Base = " + getSueldoBase() +
                "\nKilómetros = " + getKilometros() +
                "\n}";
    }
}
