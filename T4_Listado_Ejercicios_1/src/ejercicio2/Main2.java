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

public class Main2 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Alicia", "García García",1100.85);
        Empleado empleado2 = new Empleado("Bob", "Hernandez Hernandez",1234.56);

        System.out.println(empleado1);
        System.out.println(empleado2);

        empleado1.incrementarSalario(10);
        System.out.printf("El salario actual al mes es de: %.2f\n",empleado1.getSalarioMensual());
        System.out.printf("El salario actual al año es de: %.2f",empleado1.getSalarioTotal());
    }
}

