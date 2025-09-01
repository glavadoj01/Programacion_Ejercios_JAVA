package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.incrementarPrecios(5);
        ejercicio3.incremetarPrecioProducto(10, "S10_1678");
        ejercicio3.eliminarProducto("S10_1678");
        ejercicio3.insertarProducto("S10_1678", "Nuevo Producto", 100.0);
    }
}
