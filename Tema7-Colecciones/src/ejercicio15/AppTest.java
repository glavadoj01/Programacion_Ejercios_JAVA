package ejercicio15;

/*
Diseña un programa Java que lleve a cabo la gestión de una empresa de paquetería.
Para ello debes crear las siguientes clases:
    - Paquete
    - Cliente
    - GestionPaquetes

Una vez diseñadas estas clases, pruébalas en el main de un proyecto.
Crea un objeto de la clase GestionPaquetes y prueba sus métodos.
    - La creación de un nuevo paquete se hará sin que intervenga el usuario (valores al azar).
    - Para probar el metodo getTodos, recorre el ArrayList devuelto y llama a toString de cada objeto.
    - Para probar el metodo getPaquetesEstado, recorre el HashMap devuelto y
        muestra los datos en pantalla mediante toString.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class AppTest {
    public static void main(String[] args) {
        GestionPaquetes registros = new GestionPaquetes();
        Random random = new Random();
        // Clientes
        List<Cliente> carteraClientes = new ArrayList<>();
        carteraClientes.add(new Cliente("12345678A","Cliente 1","Calle Falsa","924556677","correro1@correo.com"));
        carteraClientes.add(new Cliente("23456789B","Cliente 2","Calle Verdadera","924558899","correro2@correo.com"));
        carteraClientes.add(new Cliente("45678901C","Cliente 3","Calle Intermedia","924550011","correro3@correo.com"));
        carteraClientes.add(new Cliente("67890123D","Cliente 4","Calle Mayor","924552233","correro4@correo.com"));
        carteraClientes.add(new Cliente("89012345E","Cliente 5","Calle Menor","924554455","correro5@correo.com"));
        // Paquetes
        for (int i = 1 ; i <= 4 ; i++) {
            registros.nuevoPaquete(new Paquete(String.valueOf(i),carteraClientes.get(random.nextInt(carteraClientes.size())),carteraClientes.get(random.nextInt(carteraClientes.size()))));
        }


        // Get todos
        System.out.println("***********************");System.out.println("***********************");System.out.println("***********************");
        System.out.println("Catalogo en stock de paquetes");
        for (Paquete p : registros.getTodos()) {
            System.out.println(p);
        }
        // Cambio 1 - Entregados
        esperar(2);
        System.out.println("***********************");System.out.println("***********************");System.out.println("***********************");
        System.out.println("Cambiar estado paquetes 1 y 2 a Entregado ");
        if(registros.cambiarEstado("1",Estados.ENTREGADO)) {
            System.out.println("Estado Cambiado");
        } else {
            System.out.println("Estado NO Cambiado");
        }
        if(registros.cambiarEstado("2",Estados.ENTREGADO)) {
            System.out.println("Estado Cambiado");
        } else {
            System.out.println("Estado NO Cambiado");
        }

        // Cambio 2 - Reparto
        esperar(2);
        System.out.println("***********************");System.out.println("***********************");System.out.println("***********************");
        System.out.println("Cambiar estado paquete 1 a Reparto ");
        if(registros.cambiarEstado("1",Estados.REPARTO)) {
            System.out.println("Estado Cambiado");
        } else {
            System.out.println("Estado NO Cambiado");
        }

        // Consulta estado de 1 paquete
        esperar(2);
        System.out.println("***********************");System.out.println("***********************");System.out.println("***********************");
        System.out.println("Consultar estado paquete 2:");
        System.out.println(registros.consultarEstadoPaquete("2"));



        // Consultar paquetes por estado
        System.out.println("***********************");System.out.println("***********************");System.out.println("***********************");
        System.out.println("Consultar paquetes por estado Entregado:");
        HashMap<String,Paquete> entregados = registros.getPaquetesEstado("Entregado");
        mostrar(entregados);

        System.out.println("***********************");System.out.println("***********************");System.out.println("***********************");
        System.out.println("Consultar paquetes por estado Reparto:");
        HashMap<String,Paquete> enReparto = registros.getPaquetesEstado("Reparto");
        mostrar(enReparto);

        System.out.println("***********************");System.out.println("***********************");System.out.println("***********************");
        System.out.println("Consultar paquetes por estado Almacén:");
        HashMap<String,Paquete> almacenados = registros.getPaquetesEstado("Almacén");
        mostrar(almacenados);
    }

    public static void mostrar(HashMap<String,Paquete> paquetesSegunTipo) {
        for (Paquete paquete : paquetesSegunTipo.values()) {
            System.out.println(paquete);
        }
    }
    public static void esperar(int seg) {
        try {
            Thread.sleep(seg * 1000L);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
