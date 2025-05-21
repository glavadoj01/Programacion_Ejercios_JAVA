package ejercicio11;

/*
Diseña una aplicación Java que permita gestionar una agenda. Cada contacto de la
agenda se identifica por su nombre y de él podrán guardarse varios teléfonos y/o
correos electrónicos. Crea métodos que permitan insertar nuevos contactos, agregar
teléfonos/correos a un contacto existente, buscar teléfonos/correos…
    a. Programar la agenda con HashMap
    b. Programar la agenda con Set (sin repetir nombre de contacto).
Crea una interfaz que deban implementar ambos tipo de agenda.
*/

public class TestHasMap {
    public static void main(String[] args) {
        AgendaHasMap agenda1 = new AgendaHasMap();

        for (int i = 1; i <= 5; i++) {
            agenda1.insertarNuevoContacto("Contacto " + i);

            for (int j = 1; j <= 2; j++) {
                agenda1.agregarTelefono("Contacto " + i, String.valueOf(j + 10 * j + 100 * j + 1000 * j + 10000 * i));
                agenda1.agregarCorreo("Contacto " + i, "Correo" + i + j + "@correo.com");
            }
        }

        System.out.println("Impresión Agenda Completa:");
        System.out.println("****************");
        System.out.println(agenda1);
        System.out.println("****************");
        System.out.println("Buscar Correo/s \"Contacto 1\":");
        System.out.println(agenda1.buscarCorreo("Contacto 1"));
        System.out.println("****************");
        System.out.println("Buscar Teléfono/s \"Contacto 2\":");
        System.out.println(agenda1.buscarTelefonos("Contacto 2"));


        System.out.println("Impresión Agenda Completa 2:");
        System.out.println("****************");
        System.out.println(agenda1.toString2());
        System.out.println("****************");

    }
}
