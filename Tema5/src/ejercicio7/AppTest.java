package ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        List<Producto> catalogo = new ArrayList<>();

        Fresco producto1 = new Fresco("AAAA01","Congelados Básicos de oferta",  LocalDate.of(2025,5,25),123, LocalDate.of(2025,1,1),"España");
        catalogo.add(producto1);
        Refrigerado producto2 = new Refrigerado("BBBB02","Frescos Varios",LocalDate.of(2025,2,20),456,"ONU");
        catalogo.add(producto2);
        Congelado producto3 = new Congelado("C.C.C.P.","Cerebro Congelado", LocalDate.of(2666,1,1),666,-273.15);
        catalogo.add(producto3);

        int i = 0;
        for (Producto producto : catalogo) {
            i++;
            System.out.println("\n**********\n");
            System.out.println("El producto nº " + i + ", es un: " + producto.getClass().getSimpleName());
            System.out.println(producto);
            System.out.println("¿El producto esta caducado? " + producto.estaCaducado());
        }

    }
}
