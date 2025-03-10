package ejercicio12;

public class Trabajo {
    private int id;
    private String descripcion;
    private double salario;

    public Trabajo(int id, String descripcion, double salario) {
        this.id = id;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getSalario() {
        return salario;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajo { " +
                "Id = " + id + ";\t" +
                "Descripción = " + descripcion + ";\t" +
                "Salario = " + salario + '}';
    }
}
