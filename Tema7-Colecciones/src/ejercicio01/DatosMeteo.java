package ejercicio01;

/*
Características:
    a. Atributos
        i. fecha, clase LocalDate (java.time).
        ii. temperaturas máxima y mínima, double.
        iii. humedad máxima y mínima, double.
        iv. precipitaciones, double
    b. Métodos.
        i. Constructor. Todos los atributos.
        ii. Constructor. Todos los atributos menos la fecha. Tomamos la fecha del sistema.
        iii. Getters, setters y redefinir toString.
*/

import java.time.LocalDate;

public class DatosMeteo {
    private LocalDate fecha;
    private double temperaturaMax;
    private double temperaturaMin;
    private double humedadMax;
    private double humedadMin;
    private double precipitaciones;

    public DatosMeteo(LocalDate fecha, double temperaturaMax, double temperaturaMin, double humedadMax, double humedadMin, double precipitaciones) {
        this.fecha = fecha;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.humedadMax = humedadMax;
        this.humedadMin = humedadMin;
        this.precipitaciones = precipitaciones;
    }

    public DatosMeteo(double temperaturaMax, double temperaturaMin, double humedadMax, double humedadMin, double precipitaciones) {
        this.fecha = LocalDate.now();
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.humedadMax = humedadMax;
        this.humedadMin = humedadMin;
        this.precipitaciones = precipitaciones;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getTemperaturaMax() {
        return temperaturaMax;
    }
    public void setTemperaturaMax(double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }
    public double getTemperaturaMin() {
        return temperaturaMin;
    }
    public void setTemperaturaMin(double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }
    public double getHumedadMax() {
        return humedadMax;
    }
    public void setHumedadMax(double humedadMax) {
        this.humedadMax = humedadMax;
    }
    public double getHumedadMin() {
        return humedadMin;
    }
    public void setHumedadMin(double humedadMin) {
        this.humedadMin = humedadMin;
    }
    public double getPrecipitaciones() {
        return precipitaciones;
    }
    public void setPrecipitaciones(double precipitaciones) {
        this.precipitaciones = precipitaciones;
    }

    @Override
    public String toString() {
        return "DatosMeteo{" +
                "fecha=" + fecha +
                ", temperaturaMax=" + temperaturaMax +
                ", temperaturaMin=" + temperaturaMin +
                ", humedadMax=" + humedadMax +
                ", humedadMin=" + humedadMin +
                ", precipitaciones=" + precipitaciones +
                '}';
    }
}
