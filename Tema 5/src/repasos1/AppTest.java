package repasos1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        GestionTrabajadores empresa = new GestionTrabajadores();
        empresa.setListaEmpleados(cargardatos());

        int i=0;
        for (Trabajador trabajador : empresa.getListaEmpleados()) {
            i++;
            System.out.println("\n*************\n");
            System.out.println("Trabajador nº" + i + ':');
            System.out.println("El trabajador/a es un/a: " + trabajador.getClass().getSimpleName());
            System.out.println("Datos específicos:");
            System.out.println(trabajador);
            System.out.println(trabajador.calcularSalario());
        }

        System.out.println("\n*************\n");
        System.out.println("\n*************\n");
        System.out.println("\n*************\n");
        System.out.println("Buscar por Id (nº \"4\")");
        System.out.println(empresa.buscarTrabajador(4));

        System.out.println("\n*************\n");
        System.out.println("Buscar por Nombre");
        System.out.println(empresa.buscarTrabajador("Elí"));

        System.out.println("\n*************\n");
        System.out.println("Ver salario empleado 2");
        System.out.println(empresa.verSalario(empresa.buscarTrabajador(2)));

        System.out.println("\n*************\n");
        System.out.println("Modificar Nombre");
        if (empresa.modificarDatos(empresa.buscarTrabajador("Elí"),"Elizabeth" )) {
            System.out.println("Elizabeth se ha actualizado");
        }else {
            System.out.println("Elizabeth no se ha actualizado");
        }

        System.out.println("\n*************\n");
        System.out.println("Modificar Salario");
        if(empresa.modificarSueldo(empresa.buscarTrabajador("Bob"),1500)){
            System.out.println("A Bob se le ha subido el salario 100 euritos");
        }
        else {
            System.out.println("Actualización abortada");
        }

        System.out.println("\n*************\n");
        System.out.println("Ordenar por Edad (Fecha Nacimiento)");
        empresa.mostrarListaTrabajadores(false);

        System.out.println("\n*************\n");
        System.out.println("Ordenar por Nombre (orden natural):");
        empresa.mostrarListaTrabajadores(true);

        System.out.println("\n*************\n");
        System.out.println("¡DESPEDIDO!");
        if (empresa.eliminarTrabajador(empresa.buscarTrabajador("Fernanda"))) {
            System.out.println("El trabajador se ha eliminado");
        } else {
            System.out.println("El trabajador no se ha eliminado");
        }

        System.out.println("\n*************\n");
        System.out.println("Otro despido =>");
        if (empresa.eliminarTrabajador(6)) {
            System.out.println("El trabajador se ha eliminado");
        }
        else {
            System.out.println("La trabajadora Nº6 ya fue despedida con anterioridad");
        }
    }


    public static List<Trabajador> cargardatos() {
        List<Trabajador> listaPrueba = new ArrayList<>();

        Conductores c1 = new Conductores(1,"Alice", LocalDate.of(1980,8,15),"B+C",LocalDate.of(2030,5,5),15);
        Conductores c2 = new Conductores(2,"Bob",LocalDate.of(1990,5,15),"C+D",LocalDate.of(2030,5,5),25);
        listaPrueba.add(c1);
        listaPrueba.add(c2);

        Mecanicos m1 = new Mecanicos(3,"Carlos",LocalDate.of(2000,9,1),LocalDate.of(2020,12,12),Categoria.jefetaller);
        Mecanicos m2 = new Mecanicos(4,"Damian",LocalDate.of(1900,9,1),LocalDate.of(2019,12,12),Categoria.chapista);
        listaPrueba.add(m1);
        listaPrueba.add(m2);

        Oficina o1 = new Oficina(5,"Elí",LocalDate.of(2005,6,7),Jornada.manana);
        Oficina o2 = new Oficina(6,"Fernanda",LocalDate.of(2005,6,2),Jornada.tarde);
        listaPrueba.add(o1);
        listaPrueba.add(o2);

        return listaPrueba;
    }
}
