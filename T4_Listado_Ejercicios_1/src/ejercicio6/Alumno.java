package ejercicio6;
/*
Diseña un programa Java que trabaje con la clase Alumno del ejercicio 5, copiándola
y pegándola en este. Crea otra clase llamada GestionAlumnos con las siguientes características:
    - Atributos: Array List de Alumnos
    - Métodos:
            - llenarArray, rellena el array de alumnos con datos.
            - mostrarAlumnos, muestra en pantalla cada alumno y su nota media.
            - mostrarNotas, muestra nº de expediente, nombre y nota media de cada alumno.
            - buscarAlumnoPorNumeroExpediente. Recibe como parámetro un nº de expediente
                y devuelve/retorna al alumno con ese nº expediente, o null si no lo encuentra.
    - Prueba la clase GestionAlumnos.
*/

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Random;

// Definición de Objeto/Clase
public class Alumno {
    DecimalFormat df = new DecimalFormat(".##");
    static Random crearRand = new Random();
    private int expediente;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String curso_matriculado;
    private double nota1;
    private double nota2;
    private static int contador = 0;

    // Constructor de objeto completo
    public Alumno(int expediente, String nombre, String apellido, LocalDate fecha_nacimiento,
                  String curso_matriculado, double nota1, double nota2) {
        contador++;
        this.expediente = expediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.curso_matriculado = curso_matriculado;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Constructor de objeto parcial 1
    public Alumno(String nombre, String apellido, LocalDate fecha_nacimiento,
                  String curso_matriculado, double nota1, double nota2) {
        contador++;
        this.expediente = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.curso_matriculado = curso_matriculado;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Alumno(String nombre, String apellido, LocalDate fecha_nacimiento,
                  String curso_matriculado) {
        contador++;
        this.expediente = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.curso_matriculado = curso_matriculado;
        this.nota1 = crearRand.nextDouble(0,10.00);
        this.nota2 = crearRand.nextDouble(0,10.00);
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

    public String resultado() {
        return "Número exp.: " + expediente + "\nNombre: " + nombre + "\nMedia Notas: " + df.format(mediaNotas());
    }

    @Override
    public String toString() {
        return "Alumno{ Expediente = " + expediente +
                "; Nombre = " + nombre +
                "; Apellidos = " + apellido +
                "; Fecha de Nacimiento = " + fecha_nacimiento +
                "; Curso Matriculado = " + curso_matriculado +
                "; Nota1 = " + df.format(nota1) +
                "; Nota2 = " + df.format(nota2) +
                "; Nota Media = " + df.format(mediaNotas()) +
                '}';
    }
}
