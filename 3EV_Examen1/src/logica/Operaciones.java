package logica;

import acceso_datos.AccesoBdatos;
import acceso_ficheros.AccesoFicheros;
import modelos.Producto;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Operaciones {
    
    private static List<String> listaInstrucciones = new ArrayList<>();
    private static List<String> listaParametros = new ArrayList<>();
    private static List<Producto> listaProductos = new ArrayList<>();


    public void lecturaInstrucciones() {
        listaInstrucciones = AccesoFicheros.lecturaFichero("sql.txt");
        if (listaInstrucciones == null || listaInstrucciones.isEmpty()) {
            System.out.println("No se han encontrado instrucciones en el fichero.");
        } else {
            System.out.println("Instrucciones leídas correctamente.");
        }
    }

    public void lecturaParametros() {
        listaParametros = AccesoFicheros.lecturaFichero("parametros.txt");
        if (listaParametros == null || listaParametros.isEmpty()) {
            System.out.println("No se han encontrado parámetros en el fichero.");
        } else {
            System.out.println("Parámetros leídos correctamente.");
        }
    }

    public void asociarInstruccionesParametros() {
        int contador = 0;

        if (listaInstrucciones == null || listaParametros == null) {
            System.out.println("No se pueden asociar instrucciones y parámetros porque alguno de los dos es nulo.");
            return;
        }

        if (listaInstrucciones.size() != listaParametros.size()) {
            System.out.println("El número de instrucciones y parámetros no coincide.");
            return;
        }

        for (int i = 0; i < listaInstrucciones.size(); i++) {
            String instruccion = listaInstrucciones.get(i);
            String parametros = listaParametros.get(i);
            ejecutarInstrucciones(instruccion, parametros);
            contador++;
        }
        System.out.println("Se han ejecutado " + contador + " instrucciones.");
    }

    public void ejecutarInstrucciones(String instruccion, String parametros) {
        String ordenTipo = instruccion.substring(0,6).toUpperCase();

        switch (ordenTipo) {
            case "INSERT":
                System.out.println("Ejecutando inserción INSERT");

                if (AccesoBdatos.ejecutarInsert(instruccion, parametros)) {
                    System.out.println("Inserción realizada correctamente.");

                }
                break;

            case "UPDATE":
                System.out.println("Ejecutando actualización UPDATE");

                int nRes = AccesoBdatos.ejecutarUpdate(instruccion, parametros);
                if (nRes > 0) {
                    System.out.println("Se han actualizado " + nRes + " registros.");
                } else {
                    System.out.println("Error al realizar la actualización.");
                }
                break;

            case "SELECT":
                System.out.println("Ejecutando consulta SELECT");
                listaProductos = AccesoBdatos.ejecutarSelect(instruccion, parametros);
                break;
            default:
                System.out.println("Orden no reconocida: " + ordenTipo);
        }
    }


    public Map<String, String> mapeoProductos() {
        if (listaProductos != null) {
            return listaProductos.stream()
                    .filter(p -> p.getCategoriaProducto().equalsIgnoreCase("Classic Cars"))
                    .collect(Collectors.toMap(
                            Producto::getCodigoProducto,
                            Producto::getNombreProducto)
                    );
        } else {
            System.out.println("No hay productos disponibles para mapear.");
            return Map.of();
        }
    }
}
