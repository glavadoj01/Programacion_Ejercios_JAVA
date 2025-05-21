package ejercicio15;

/*
- Atributos.
    - id, String.
    - fecha de envío y fecha de recepción, DateTime o LocalDate.
    - estado, String. El estado solo debe permitir los valores: ALMACEN, REPARTO y ENTREGADO.
    - cliente origen y cliente destino, clase Cliente.
- Métodos.
    - constructor, toString, getters y setters.
        El constructor asignará a la fecha de recepción null y al estado el valor ALMACEN.
    - Si se cambia el estado del paquete a ENTREGADO, debe ponerse como fecha de recepción la fecha del sistema.
        Si el cambio es a los estados ALMACEN o REPARTO, la fecha de recepción se pondrá de nuevo a null.
*/

import java.time.LocalDate;

public class Paquete {
    private String id;
    private LocalDate fechaEnvio;
    private LocalDate fechaRecepcion;
    private Estados estado;
    private Cliente clienteOrigen;
    private Cliente clienteDestino;

    public Paquete(String id, LocalDate fechaEnvio, Cliente clienteOrigen, Cliente clienteDestino) {
        this.id = id;
        this.fechaEnvio = fechaEnvio;
        this.fechaRecepcion = null;
        this.estado = Estados.ALMACEN;
        this.clienteOrigen = clienteOrigen;
        this.clienteDestino = clienteDestino;
    }

    public Paquete(String id, Cliente clienteOrigen, Cliente clienteDestino) {
        this.id = id;
        this.fechaEnvio = LocalDate.now();
        this.fechaRecepcion = null;
        this.estado = Estados.ALMACEN;
        this.clienteOrigen = clienteOrigen;
        this.clienteDestino = clienteDestino;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }
    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    public LocalDate getFechaRecepcion() {
        return fechaRecepcion;
    }
    public void setFechaRecepcion(LocalDate fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }
    public Estados getEstado() {
        return estado;
    }
    // SET ESTADO tiene metodología propia
    public Cliente getClienteOrigen() {
        return clienteOrigen;
    }
    public void setClienteOrigen(Cliente clienteOrigen) {
        this.clienteOrigen = clienteOrigen;
    }
    public Cliente getClienteDestino() {
        return clienteDestino;
    }
    public void setClienteDestino(Cliente clienteDestino) {
        this.clienteDestino = clienteDestino;
    }
    @Override
    public String toString() {
        return "Paquete Id = " + id +
                "\n\tFecha de Envío = " + fechaEnvio +
                "\n\tFecha de Recepción = " + fechaRecepcion +
                "\n\tEstado = " + estado +
                "\n\tCliente Origen  = " + clienteOrigen +
                "\n\tCliente Destino = " + clienteDestino;
    }

    public void cambiarEstado(Estados estadoDestino) {
        if (Estados.ENTREGADO == estadoDestino) {
            this.estado = Estados.ENTREGADO;
            this.fechaRecepcion = LocalDate.now();
        }
        else {
            this.estado = estadoDestino;
            this.fechaRecepcion = null;
        }
    }
}
