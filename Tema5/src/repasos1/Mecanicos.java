package repasos1;

import java.time.LocalDate;

public class Mecanicos extends Trabajador {
    private LocalDate antiguedad; // Fecha Incorporación más bien
    private Categoria puesto;
    private double sueldoBase;

    public Mecanicos(int id, String nombre, LocalDate fechaNacimiento, LocalDate antiguedad, Categoria puesto) {
        super(id, nombre, fechaNacimiento);
        this.antiguedad = antiguedad;
        this.puesto = puesto;
        this.sueldoBase = 1300;
    }

    @Override
    double calcularSalario() {
        return sueldoBase+puesto.getComplemento();
    }

    public LocalDate getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }
    public Categoria getPuesto() {
        return puesto;
    }
    public void setPuesto(Categoria puesto) {
        this.puesto = puesto;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Mecánico {" +
                super.toString() +
                "\nAntigüedad desde = " + antiguedad +
                "\nPuesto = " + puesto.getName() +
                "\nSueldo Base = " + sueldoBase +
                "\n}";
    }
}
