package examenRecSegundo;

import java.time.LocalDate;

public class Produccion extends Trabajador {
    private String puesto;
    private double salarioBase;

    public Produccion(int id, String nombre, LocalDate fechaNacimiento, String puesto, double salarioBase) {
        super(id, nombre, fechaNacimiento);
        this.puesto = puesto;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        if (this.puesto.equals("JEFE TALLER")) {
            return this.salarioBase + 1000; // Me he inventado las cantidades de los complementos
        }                                   // Más o menos son parecidas a las de un ejercicio que hicimos
        if (this.puesto.equals("OFICIAL")) {
            return this.salarioBase + 800;
        }
        if (this.puesto.equals("MECANICO")) {
            return this.salarioBase + 500;
        }
        return this.salarioBase + 200;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    @Override
    public String toString() {
        return "Empleado Dpto. Producción {" +
                super.toString() +
                "\nPuesto = " + puesto +
                "\nSalario Base = " + salarioBase +
                "\n}";
    }
}
