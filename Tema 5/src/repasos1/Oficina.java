package repasos1;

import java.time.LocalDate;

public class Oficina extends Trabajador {
    private Jornada tipoJornada; // manana o tarde
    private double sueldoBase;

    public Oficina(int id, String nombre, LocalDate fechaNacimiento, Jornada tipoJornada) {
        super(id, nombre, fechaNacimiento);
        this.tipoJornada = tipoJornada;
        this.sueldoBase = 1500;
    }

    @Override
    double calcularSalario() {
        return sueldoBase;
    }

    public Jornada getTipoJornada() {
        return tipoJornada;
    }
    public void setTipoJornada(Jornada tipoJornada) {
        this.tipoJornada = tipoJornada;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Oficina {" +
                super.toString() +
                "\nTipo de Jornada = " + tipoJornada.getTipoJornada() +
                "\nSueldo Base = " + sueldoBase +
                "\n}";
    }
}
