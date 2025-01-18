package ejercicio5;
/*
En un nuevo proyecto, copia la clase Alumno del ejercicio 1, y añade:
a. Dos atributos que guarden sendas notas (tipo double).
b. Crea los métodos get/set correspondientes, modifica también el constructor para que incluya estas notas.
c. Crea un método que devuelva la media de las notas (double).
d. Crea un método que devuelva número de expediente, nombre y nota media.
*/

import java.time.LocalDate;

// Definición de Objeto/Clase
public class Alumno {
    private int expediente;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String curso_matriculado;
    private double nota1;
    private double nota2;

    // Constructor de objeto
    public Alumno(int expediente, String nombre, String apellido, LocalDate fecha_nacimiento,
                  String curso_matriculado, double nota1, double nota2) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.curso_matriculado = curso_matriculado;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Métodos GET
    public int getExpediente() {
        return expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha_Nacimiento() {
        return fecha_nacimiento;
    }

    public String getCurso_matriculado() {
        return curso_matriculado;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    //Métodos SET
    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setCurso_matriculado(String curso_matriculado) {
        this.curso_matriculado = curso_matriculado;
    }

    public void setNota1(double nota) {
        this.nota1 = nota;
    }

    public void setNota2(double nota) {
        this.nota2 = nota;
    }

    // Métodos Especiales y/o Sobreescritos
    public double mediaNotas() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String devolverDatos() {
        return (this.expediente + "\t" + this.nombre + "\t" + mediaNotas());
    }

    @Override
    public String toString() {
        return "Alumno{ Expediente= " + expediente +
                "; Nombre= " + nombre +
                "; Apellidos= " + apellido +
                "; Fecha de Nacimiento= " + fecha_nacimiento +
                "; Curso Matriculado= " + curso_matriculado +
                '}';
    }
}
