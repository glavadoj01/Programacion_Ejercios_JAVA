package ejercicio7;

/*
La clase Producto es abstracta.
Todos los productos llevan una información común:
        idproducto, descripcion, fecha de caducidad y número de lote.
*/
import java.time.LocalDate;


public abstract class Producto {
    private String idproducto;
    private String descripcion;
    private LocalDate fechaCad;
    private int nLote;

    public Producto(String idproducto, String descripcion, LocalDate fechaCad, int nLote) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.fechaCad = fechaCad;
        this.nLote = nLote;
    }

    abstract boolean estaCaducado();

    public String getIdproducto() {
        return idproducto;
    }
    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalDate getFechaCad() {
        return fechaCad;
    }
    public void setFechaCad(LocalDate fechaCad) {
        this.fechaCad = fechaCad;
    }
    public int getnLote() {
        return nLote;
    }
    public void setnLote(int nLote) {
        this.nLote = nLote;
    }

    @Override
    public String toString() {
        return "\nId = " + getIdproducto() +
                "\nDescripción = " + getDescripcion() +
                "\nFecha de Caducidad = " + getFechaCad() +
                "\nNº de Lote = " + getnLote();
    }
}
