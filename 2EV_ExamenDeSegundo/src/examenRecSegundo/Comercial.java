package examenRecSegundo;

import java.time.LocalDate;

public class Comercial extends Trabajador implements Iventas {
    private double kilometros;
    private double salarioBase;

    public Comercial(int id, String nombre, LocalDate fechaNacimiento, double kilometros, double salarioBase) {
        super(id, nombre, fechaNacimiento);
        this.kilometros = kilometros;
        this.salarioBase = salarioBase;
    }

    @Override
    public double ventasRealizadas() {
        return 0; // Consulta a la BBDD y devolver resultado
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (kilometros*0.5);
    }

    public double getKilometros() {
        return kilometros;
    }
    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado Dpto. Comercial {" +
                super.toString() +
                "\nKilómetros = " + kilometros +
                "\nSalario Base = " + salarioBase +
                "\n}";
    }
}
