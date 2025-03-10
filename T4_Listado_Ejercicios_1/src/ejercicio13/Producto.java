package ejercicio13;

/*
De cada producto se guarda un código, nombre, tipo (pintura, herramienta, recambio, cinta,...), precio de venta, precio de compra y unidades disponibles.
Crea una clase Producto con los atributos nombrados, los métodos getters, setters y el constructor.
*/

import java.text.DecimalFormat;
import java.util.Objects;

public class Producto {
    private String codigo;
    private String nombre;
    private Tipo tipo;
    private double precioVenta;
    private double precioCompra;
    private int unidadesDisponibles;

    // Constructor Completo
    public Producto(String codigo, String nombre, Tipo tipo, double precioVenta,double precioCompra, int unidadesDisponibles) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    // Colección Métodos Set
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    // Colección Métodos Get
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    // Métodos sobreescritos
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Producto{ " +
                "Código = " + codigo + " ;\t" +
                "Nombre = " + nombre + " ;\t" +
                "Tipo = " + tipo + " ;\t" +
                "Precio de Venta = " + df.format(precioVenta) + " € ;\t" +
                "Precio de Compra = " + df.format(precioCompra) + " € ;\t" +
                "Unidades Disponibles = " + unidadesDisponibles + " }";
    }

    @Override // Solo: Código & Tipo
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(getCodigo(), producto.getCodigo()) &&
                              getTipo() == producto.getTipo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getTipo());
    }
}
