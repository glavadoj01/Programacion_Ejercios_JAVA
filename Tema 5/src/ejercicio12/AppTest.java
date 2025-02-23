package ejercicio12;

public class AppTest {
    public static void main(String[] args) {
        PersonaDao dao = new PersonaDao();

        Trabajo t1 = new Trabajo(1, "Programador", 2000);
        Trabajo t2 = new Trabajo(2, "Analista", 2500);
        Trabajo t3 = new Trabajo(3, "Jefe de proyecto", 3000);

        Persona p1 = new Persona("1111A", "Juan", t1, 45);
        Persona p2 = new Persona("3333C", "Ana", t2, 30);
        Persona p3 = new Persona("2222B", "Luis", t3, 35);
        System.out.println("--------------------------------------------");
        dao.insertarPersona(p1);
        dao.insertarPersona(p2);
        dao.insertarPersona(p3);
        System.out.println("--------------------------------------------");
        System.out.println("Numero de personas: " + dao.getNumeroPersonas());
        System.out.println("--------------------------------------------");
        System.out.println("Datos de las personas:");
        dao.mostrarDatos();
        System.out.println("--------------------------------------------");
        System.out.println("Buscar persona con dni 2222B: " + dao.buscarPersona("2222B"));
        System.out.println("Buscar persona con dni 4444D: " + dao.buscarPersona("4444D"));
        System.out.println("--------------------------------------------");
        System.out.println("Cambiar puesto de trabajo de persona con dni 2222B a Jefe de proyecto: " + dao.cambiarPuestoTrabajo("2222B", t3));
        System.out.println("--------------------------------------------");
        System.out.println("Obtener 2 primeras personas (este metodo preordena la lista:");
        for (Persona p : dao.getNPrimerasPersonas(2)) {
            System.out.println(p);
        }

        System.out.println("--------------------------------------------");
        System.out.println("Ordenar por defecto (DNI): ");
        dao.ordenarDatos();
        dao.mostrarDatos();

        System.out.println("--------------------------------------------");
        System.out.println("Ordenar por edad:");
        dao.ordenarDatosPorEdad();
        dao.mostrarDatos();
    }
}
