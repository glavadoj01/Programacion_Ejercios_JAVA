package ejercicio2;

/*
Diseña una clase llamada Empleado con las características que se citan a
continuación. Prueba sus métodos.
    a. Atributos. id, nombre, apellidos, salario mensual.
    b. Métodos: constructor, getters y setters.
    c. Añade los métodos:
        i. getNombreCompleto. Devuelve el nombre del empleado con la
            forma: Apellidos, Nombre.
        ii. getSalarioAnual. Este se obtiene multiplicando por doce el
            salario mensual.
        iii. incrementaSalario (int porcentaje). Incrementa el salario en el
            porcentaje indicado.
        iv. toString.
    d. Crea dos empleados y prueba los métodos programados, incrementa
        su salario y obtén el salario anual.
*/

// Definición de clase
public class Empleado {
    private final int id;
    private String nombre;
    private String apellido;
    private double salarioMensual;
    private int contador_Empleados = 0;

    // Constructor de objeto
    public Empleado(String nombre, String apellido, double salarioMensual) {
        contador_Empleados++;
        this.id = contador_Empleados;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
    }

    // Métodos GET
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    // Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    // Métodos Especiales
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public double getSalarioTotal() {
        return salarioMensual * 12;
    }

    public void incrementarSalario(float porcentaje) {
        this.salarioMensual = salarioMensual * (1 + (porcentaje / 100));
    }

    // Métodos sobreescritos
    @Override
    public String toString() {
        return "Datos del Empleado {Id= " + id +
                "; Nombre= " + nombre +
                "; Apellido= " + apellido +
                "; Salario Mensual= " + salarioMensual + " €}";
    }
}