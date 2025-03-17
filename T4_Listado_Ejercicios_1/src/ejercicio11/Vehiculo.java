package ejercicio11;

/*
De cada vehículo se guarda matrícula, marca, modelo, potencia, consumo medio y precio de alquiler diario.
Diseña la clase Vehículo con los atributos que se han indicado, getters/setters y constructor.
Diseña también un segundo constructor que reciba como parámetros la matrícula y el precio diario de alquiler.
*/

import java.text.DecimalFormat;
import java.util.Objects;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private double potencia; // KiloWatios [KiloJulios/segundo]
    private double consumoMedio; // litros por 100Km
    private double precioDiario; // € por dia
    private boolean disponible;

    // Constructor Completo
    public Vehiculo(String matricula, String marca, String modelo, double potencia, double consumoMedio, double precioDiario) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.consumoMedio = consumoMedio;
        this.precioDiario = precioDiario;
        this.disponible = true;
    }

    // Constructor Parcial
    public Vehiculo(String matricula, double precioDiario) {
        this.matricula = matricula;
        this.precioDiario = precioDiario;
        this.disponible = true;
    }

    // Métodos Get
    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPotencia() {
        return potencia;
    }
    public double getConsumoMedio() {
        return consumoMedio;
    }
    public double getPrecioDiario() {
        return precioDiario;
    }
    public boolean isDisponible() {
        return disponible;
    }

    // Métodos Set
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos sobrescritos
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Vehiculo{ " +
                "Matricula = " + matricula + ";\t" +
                "Marca = " + marca + ";\t" +
                "Modelo = " + modelo + ";\t" +
                "Potencia [KW] = " + df.format(potencia) + ";\t" +
                "Consumo Medio [l/100Km] = " + df.format(consumoMedio) + ";\t" +
                "Precio Diario = " + precioDiario + ";\t" +
                "Disponible = " + disponible + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return  Double.compare(getPotencia(), vehiculo.getPotencia()) == 0 &&
                Double.compare(getConsumoMedio(), vehiculo.getConsumoMedio()) == 0 &&
                Double.compare(getPrecioDiario(), vehiculo.getPrecioDiario()) == 0 &&
                isDisponible() == vehiculo.isDisponible() &&
                Objects.equals(getMatricula(), vehiculo.getMatricula()) &&
                Objects.equals(getMarca(), vehiculo.getMarca()) &&
                Objects.equals(getModelo(), vehiculo.getModelo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula(),
                            getMarca(),
                            getModelo(),
                            getPotencia(),
                            getConsumoMedio(),
                            getPrecioDiario(),
                            isDisponible());
    }

    // Métodos de comparación secundaría
    public boolean vehiculoSimilar(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return  Double.compare(getPotencia(), vehiculo.getPotencia()) == 0 &&
                Double.compare(getConsumoMedio(), vehiculo.getConsumoMedio()) == 0 &&
                Objects.equals(getMarca(), vehiculo.getMarca()) &&
                Objects.equals(getModelo(), vehiculo.getModelo());
    }
}
