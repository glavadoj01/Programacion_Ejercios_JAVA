package ejercicio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private final String id;
    private final String nombre;
    private final HashMap<Integer, Integer> ventas;

    public Producto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.ventas = new HashMap<>();
    }

    public Producto(String id, String nombre, int anno, int venta) {
        this.id = id;
        this.nombre = nombre;
        this.ventas = new HashMap<>(){{put(anno,venta);}};
    }

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public HashMap<Integer, Integer> getVentas() {
        return ventas;
    }
    @Override
    public boolean equals(Object o) { // Id + Nombre
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(getId(), producto.getId()) && Objects.equals(getNombre(), producto.getNombre());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre());
    }
    @Override
    public int compareTo(Producto o) {
        return this.id.compareTo(o.getId());
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(id + ';' + nombre);
        for (Map.Entry<Integer, Integer> entry : ventas.entrySet()) {
            sb.append(';').append(entry.getKey()).append(';').append(entry.getValue());
        }
        return sb.toString();
    }
}
