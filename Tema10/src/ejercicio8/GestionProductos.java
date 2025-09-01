package ejercicio8;

import java.io.*;
import java.util.ArrayList;

public class GestionProductos {
    private final ArrayList<Producto> catalogoProductos;

    public GestionProductos() {
        this.catalogoProductos = leerFicheroProductos();
    }

    public boolean agregarProducto(Producto producto) {
        return catalogoProductos.add(producto);
    }

    public boolean eliminarProducto(Producto producto) {
        return this.catalogoProductos.remove(producto);
    }

    public Producto consultararProducto(int id) {
        for (Producto producto : catalogoProductos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    public void listarCatalogoProductos() {
        for (Producto producto : catalogoProductos) {
            System.out.println(producto);
        }
    }
    public boolean existeProducto(int id) {
        for (Producto producto : catalogoProductos) {
            if (producto.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private ArrayList<Producto> leerFicheroProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        String linea;
        String[] datos;

        try (BufferedReader br = new BufferedReader(new FileReader("src/tema10/ejercicio8/fichero.csv"))) {
            while ((linea=br.readLine()) != null) {
                datos = linea.split(";");
                productos.add(new Producto(Integer.parseInt(datos[0]),datos[1],Double.parseDouble(datos[2]),datos[3] ));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return productos;
    }

    public boolean guardar() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/tema10/ejercicio8/fichero.csv"))) {

            for (Producto producto : catalogoProductos) {
                bw.write(producto.toString());
                bw.newLine();
            }
            bw.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
