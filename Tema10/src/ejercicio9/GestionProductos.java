package ejercicio9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class GestionProductos {
    private ArrayList<Producto> catalogo;
    private final String carpeta = "src/tema10/ejercicio9";

    public GestionProductos() {
        String archivo = "datosProductos.txt";
        try {
            this.catalogo = Datos.leerDatos(carpeta, archivo);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public Producto buscarProducto (String id) {
        for (Producto p : catalogo) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    public ArrayList<Producto> productosConNVentas(int nMin) {
        ArrayList<Producto> productosSalida = new ArrayList<>();
        int nVentas;

        for (Producto p : catalogo) {
            nVentas = 0;
            for (Map.Entry<Integer,Integer> entry : p.getVentas().entrySet()) {
                nVentas += entry.getValue();
            }
            if (nVentas >= nMin) {
                productosSalida.add(p);
            }
        }
        return productosSalida;
    }
    public ArrayList<Producto> ventasAnno (int anno) {
        ArrayList<Producto> nVentas = new ArrayList<>();

        for (Producto p : catalogo)  {
            nVentas.add(new Producto(p.getId(), p.getNombre(), anno, p.getVentas().getOrDefault(anno, 0)));
        }
        return nVentas;
    }

    public boolean ficheroVentasAnno (int anno) {
        try {
            return Datos.escribirDatos(carpeta,"Ventas_" + anno + ".txt",ventasAnno(anno));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
