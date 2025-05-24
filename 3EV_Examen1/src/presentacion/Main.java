package presentacion;

import logica.Operaciones;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de gestión de productos.");
        Operaciones op = new Operaciones();

        // 1. Lectura de ficheros
        op.lecturaInstrucciones();
        op.lecturaParametros();

        // 2. Tratamiento de instrucciones
        op.asociarInstruccionesParametros();

        // 3. Mapeo de productos
        Map<String, String> productos = op.mapeoProductos();
        System.out.println("-------------------------------------------");
        System.out.println("Productos mapeados (Categoria Classic Cars)");
        System.out.println("-------------------------------------------");
        System.out.println("\tCódigo\t Nombre");
        productos.forEach((key, value) -> System.out.println(key + value));
    }
}
