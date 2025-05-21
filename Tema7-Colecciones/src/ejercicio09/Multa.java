/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

import java.time.LocalDate;
import java.util.Objects;

public class Multa implements Comparable<Multa> {
    private String matricula;
    private LocalDate fechaMulta;
    private Double importeMulta;

    public Multa(String matricula, LocalDate fechaMulta, Double importeMulta) {
        this.matricula = matricula;
        this.fechaMulta = fechaMulta;
        this.importeMulta = importeMulta;
    }

    public Double getImporteMulta() {
        return importeMulta;
    }
    public void setImporteMulta(Double importeMulta) {
        this.importeMulta = importeMulta;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getFechaMulta() {
        return fechaMulta;
    }
    public void setFechaMulta(LocalDate fechaMulta) {
        this.fechaMulta = fechaMulta;
    }

    @Override
    public int compareTo(Multa o) {
        if (this.matricula.equals(o.getMatricula())) {
            return this.fechaMulta.compareTo(o.getFechaMulta());
        }
        return this.matricula.compareTo(o.getMatricula());
    }

    @Override
    public String toString() {
        return "Multa{" + "\tMatricula = " + matricula + "\tFecha Multa = " + fechaMulta + "\tImporte = " + importeMulta + " €\t}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Multa multa = (Multa) o;
        return Objects.equals(getMatricula(), multa.getMatricula()) && Objects.equals(getFechaMulta(), multa.getFechaMulta()) && Objects.equals(getImporteMulta(), multa.getImporteMulta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula(), getFechaMulta(), getImporteMulta());
    }
}
