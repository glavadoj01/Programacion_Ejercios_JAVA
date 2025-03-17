package Examenes.segundo;

import java.time.LocalDate;

public class TrabajoPintura extends Servicios {
    private double metrosCuadrados;
    private double precioMetroCuadrado;

    public TrabajoPintura(int idServicio, Empleado empleado, LocalDate fechaInicio, String cliente,
                          double metrosCuadrados, double precioMetroCuadrado) {
        super(idServicio, empleado, fechaInicio, cliente);
        this.metrosCuadrados = metrosCuadrados;
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + ',' +
                getIdServicio() + ',' +
                getEmpleado().getId() + ',' +
                getEmpleado().getNombre() + ',' +
                getFechaInicio() + ',' +
                getCliente() + ',' +
                getMetrosCuadrados() + ',' +
                getPrecioMetroCuadrado();
    }

    @Override
    public double costeMaterial() {
        return (this.metrosCuadrados / 7.8) * this.precioMetroCuadrado;
    }

    @Override
    public double costeManoObra() {
        return Convenio.precioHora("TrabajoPintura");
    }

    private double costeAdicional() {
        if (this.metrosCuadrados < 50) {
            return 1.15;
        }
        return 1;
    }

    @Override
    public double costeTotal() {
        return (costeMaterial() + costeManoObra()) * costeAdicional();
    }

    @Override
    public String detalleServicio() {
        if (costeAdicional() == 1) {
            return "\n\nTRABAJO DE PINTURA" +
                    "\nCliente: " + getCliente() +
                    "\nFecha de inicio: " + getFechaInicio() +
                    "\n-------------------------------" +
                    "\nPintor: " + getEmpleado().getId() +
                    "\nCoste Material: " + costeMaterial() +
                    "\nCoste Mano Obra: " + costeManoObra() +
                    "\nCoste Adicional: " + 0 +
                    "\nTOTAL: " + costeTotal() +
                    "\n-------------------------------";
        }
        return "\n\nTRABAJO DE PINTURA" +
                "\nCliente: " + getCliente() +
                "\nFecha de inicio: " + getFechaInicio() +
                "\n-------------------------------" +
                "\nPintor: " + getEmpleado().getId() +
                "\nCoste Material: " + costeMaterial() +
                "\nCoste Mano Obra: " + costeManoObra() +
                "\nCoste Adicional: " + ((costeMaterial() + costeManoObra()) * 0.15) +
                "\nTOTAL: " + costeTotal() +
                "\n-------------------------------";
    }
}
