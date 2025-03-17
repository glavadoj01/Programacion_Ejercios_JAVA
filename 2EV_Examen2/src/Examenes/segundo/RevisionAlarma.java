package Examenes.segundo;

import java.time.LocalDate;

public class RevisionAlarma extends Servicios {
    private int numAlarmas;

    public RevisionAlarma(int idServicio, Empleado empleado, LocalDate fechaInicio,
                          String cliente, int numAlarmas) {
        super(idServicio, empleado, fechaInicio, cliente);
        this.numAlarmas = numAlarmas;
    }

    public int getNumAlarmas() {
        return numAlarmas;
    }
    public void setNumAlarmas(int numAlarmas) {
        this.numAlarmas = numAlarmas;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ',' +
                getIdServicio() + ',' +
                getEmpleado().getId() + ',' +
                getEmpleado().getNombre() + ',' +
                getFechaInicio() + ',' +
                getCliente() + ',' +
                getNumAlarmas();
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return numAlarmas * Convenio.precioHora("RevisionAlarma");
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        return "\n\nREVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS" +
                "\nCliente: " + getCliente() +
                "\nFecha revisión: " + getFechaInicio() +
                "\n-------------------------------" +
                "\nTotal: " + costeTotal() +
                "\n-------------------------------";
    }
}
