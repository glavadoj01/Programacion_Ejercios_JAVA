package ejercicio7;

import java.time.LocalDate;

public class Refrigerado extends Producto {
    private String codOrgSup;

    public Refrigerado(String idproducto, String descripcion, LocalDate fechaCad, int nLote, String codOrgSup) {
        super(idproducto, descripcion, fechaCad, nLote);
        this.codOrgSup = codOrgSup;
    }

    public String getCodOrgSup() {
        return codOrgSup;
    }
    public void setCodOrgSup(String codOrgSup) {
        this.codOrgSup = codOrgSup;
    }

    @Override
    boolean estaCaducado() {
        return getFechaCad().isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        return "\nProducto Refrigerado {" +
                super.toString() +
                "\nCódigo del Organismo de Supervisión Alimentaria = " + getCodOrgSup() +
                "\n}";
    }
}
