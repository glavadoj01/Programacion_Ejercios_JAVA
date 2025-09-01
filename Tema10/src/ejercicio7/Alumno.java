package ejercicio7;


import java.text.DecimalFormat;
import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private int id;
    private String nombre;
    private double[] notas;


    public Alumno() {
        this.id = 0;
        this.nombre = "";
        this.notas = new double[10];
    }
    public Alumno(int id, String nombre, double[] notas) {
        this.id = id;
        this.nombre = nombre;
        this.notas = notas;
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
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override // Id + Nombre
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return getId() == alumno.getId() && Objects.equals(getNombre(), alumno.getNombre());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre());
    }
    @Override   // Ordenación Natural por Id
    public int compareTo(Alumno o) {
        return this.id - o.getId();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder salida = new StringBuilder("Alumno\t{Id = " + id + "\tNombre = " + nombre + "\n\tNotas:\t");
        for (double nota : notas) {
            salida.append(df.format(nota)).append(";\t");
        }
        salida.append("\b\b\t}");
        return salida.toString();
    }
}
