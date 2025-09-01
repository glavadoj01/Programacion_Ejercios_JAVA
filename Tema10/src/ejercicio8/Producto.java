package ejercicio8;

import java.util.Objects;

public class Producto implements Comparable<Producto>{
    private int id;
    private String nombre;
    private double precio;
    private String proveedor;

    public Producto(int id, String nombre, double precio, String proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    @Override // Solo Id
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return getId() == producto.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return id + ";" + nombre + ";" + precio + ";" + proveedor;
    }

    @Override // Orden Natural por Id
    public int compareTo(Producto o) {
        return this.id - o.getId();
    }
}
