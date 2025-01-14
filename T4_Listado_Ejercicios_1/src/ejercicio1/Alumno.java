package ejercicio1;

import java.time.LocalDate;

/*
Diseña un programa en Java que trabaje con una clase llamada Alumno. Serán
atributos del alumno su número de expediente, nombre, apellidos, fecha de nacimiento
y curso en el que se matricula. La clase debe incluir un constructor y los métodos get
y set correspondientes y toString. Instancia varios objetos de esta clase y prueba los
métodos creados.
*/

// Definición de Objeto/Clase
public class Alumno {
    private int expediente;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String curso_matriculado;

    // Constructor de objeto
    public Alumno(int expediente, String nombre, String apellido, LocalDate fecha_nacimiento, String curso_matriculado) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.curso_matriculado = curso_matriculado;
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

    // Métodos Especiales y/o Sobreescritos
    @Override
    public String toString() {
        return "Alumno{ Expediente= " +
                expediente +
                "; Nombre= " +
                nombre +
                "; Apellidos= " +
                apellido +
                "; Fecha de Nacimiento= " +
                fecha_nacimiento +
                "; Curso Matriculado= " +
                curso_matriculado +
                '}';
    }
}
