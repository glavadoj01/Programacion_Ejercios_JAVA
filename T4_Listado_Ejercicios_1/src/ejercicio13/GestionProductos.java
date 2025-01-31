package ejercicio13;

/*
Diseña también una clase llamada GestionProductos que tendrá un array list de productos como atributo.
Esta clase llevará los siguientes métodos:
    a. Constructor. Llenará el array de productos con valores al azar.
    b. filtrarPorPrecioVenta. Pasar un precio y mostrar todos productos con precio superior al pasado.
    c. filtrarPorTipo. Pasar un tipo de producto y mostrar los que coinciden con él.
    d. mostrarDiferencia. Mostrar nombre de producto, precio de compra, precio de venta y la diferencia entre ambos.
    e. mostrarProductoPosicion. Recibe como parámetro una posición y muestra el producto que está en esa posición del array.
    f. cambiarPor. Este método recibe un producto y una posición y sustituirá en el array el producto situado
                    en la posición indicada por el producto pasado como parámetro.
                    Devuelve verdadero o falso, según se haya podido hacer el cambio o no.
*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class GestionProductos {
    private ArrayList<Producto> catalogoProductos;

    public GestionProductos() {
        catalogoProductos = new ArrayList<>();
        cargarProductosAzar();
    }

    public ArrayList<Producto> getCatalogoProductos() {
        return catalogoProductos;
    }

    public ArrayList<Producto> filtarPorPrecioVenta(double precio) {
        ArrayList<Producto> listaFiltrada = new ArrayList<>();
        for (Producto producto : catalogoProductos) {
            if (producto.getPrecioVenta() > precio) {
                listaFiltrada.add(producto);
            }
        }
        return listaFiltrada;
    }

    public ArrayList<Producto> filtarPorTipo(Tipo tipoBuscar) {
        ArrayList<Producto> listaFiltrada = new ArrayList<>();
        for (Producto producto : catalogoProductos) {
            if (producto.getTipo() == tipoBuscar) {
                listaFiltrada.add(producto);
            }
        }
        return listaFiltrada;
    }

    public void mostrarDiferencia(Producto producto1, Producto producto2) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println("La diferencia de precios es: " +
                    df.format (producto1.getPrecioVenta() - producto2.getPrecioVenta()) + " €");
    }

    public void mostrarProducto(int posicion) {
        System.out.println(catalogoProductos.get(posicion - 1));
    }

    public boolean cambiarPor(Producto producto, int posicion) {
        catalogoProductos.set(posicion - 1, producto);
        return false;
    }

    public void mostrarTodos() {
        for (Producto producto : catalogoProductos) {
            System.out.println(producto);
        }
    }

    private void cargarProductosAzar() {
        Random crearRandom = new Random();
        String codigoA;
        String nombreA;
        Tipo tipoA;
        double precioVenA;
        double precioComB;
        int unidadesA;

        for (int i = 1; i <= 50; i++) {
            codigoA = String.valueOf(i);
            nombreA = "Pintura " + i;
            tipoA = Tipo.pintura;
            precioVenA = crearRandom.nextDouble(50-10)+10;
            precioComB = crearRandom.nextDouble(25-5)+5;
            unidadesA = crearRandom.nextInt(11);
            catalogoProductos.add(new Producto(codigoA,nombreA,tipoA,precioVenA,precioComB,unidadesA));
        }

        for (int i = 51; i <= 70; i++) {
            codigoA = String.valueOf(i);
            nombreA = "Caja de Tornillos " + i;
            tipoA = Tipo.tornilleria;
            precioVenA = crearRandom.nextDouble(50-10)+10;
            precioComB = crearRandom.nextDouble(25-5)+5;
            unidadesA = crearRandom.nextInt(11);
            catalogoProductos.add(new Producto(codigoA,nombreA,tipoA,precioVenA,precioComB,unidadesA));
        }

        for (int i = 71; i <= 90; i++) {
            codigoA = String.valueOf(i);
            nombreA = "Tuberías y juntas " + i;
            tipoA = Tipo.plomeria;
            precioVenA = crearRandom.nextDouble(50-10)+10;
            precioComB = crearRandom.nextDouble(25-5)+5;
            unidadesA = crearRandom.nextInt(11);
            catalogoProductos.add(new Producto(codigoA,nombreA,tipoA,precioVenA,precioComB,unidadesA));
        }

        for (int i = 91; i <= 100; i++) {
            codigoA = String.valueOf(i);
            nombreA = "Recambios nº " + i;
            tipoA = Tipo.recambio;
            precioVenA = crearRandom.nextDouble(50-10)+10;
            precioComB = crearRandom.nextDouble(25-5)+5;
            unidadesA = crearRandom.nextInt(11);
            catalogoProductos.add(new Producto(codigoA,nombreA,tipoA,precioVenA,precioComB,unidadesA));
        }

        catalogoProductos.add(new Producto("AAA","Tornillo Bueno", Tipo.tornilleria, 1.15,0.75,10));
        catalogoProductos.add(new Producto("BBB", "Tornillo Malo",Tipo.tornilleria, 0.8,0.3, 12));
        catalogoProductos.add(new Producto("CCC", "Junta tubular", Tipo.plomeria, 1.5,1.00,5));
        catalogoProductos.add(new Producto("DDD","Martillo", Tipo.herramienta, 15,10,64));
        catalogoProductos.add(new Producto("EEE", "Llave inglesa", Tipo.herramienta,23,18,21));
    }
}