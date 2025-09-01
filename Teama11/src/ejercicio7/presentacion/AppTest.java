package ejercicio7.presentacion;

/*
Diseña una aplicación Java que genere un archivo de texto con los productos de una categoría concreta
de la base de datos “classicModels”. Cada registro de la tabla debe corresponderse con una línea del
archivo. Utiliza el punto y coma (;) como separador de columnas en el archivo. Usa solo los campos
código, nombre, categoría, precio de venta y de compra.

El archivo tendrá el nombre: Productos_Categoria_XXXX.txt; donde XXXX será la categoría elegida.
*/

import java.util.Scanner;
import static tema11.ejercicio7.operaciones.Operaciones.mostrarCategorias;
import static tema11.ejercicio7.operaciones.Operaciones.generarFichero;

public class AppTest {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        char cont;
        String categ;

        do {
            mostrarCategorias();
            System.out.println("Nota: SQL no es case sensitive para las consultas");
            System.out.print("Elegir una categoria: ");
            categ=sc.nextLine();
            System.out.println("------------------------------------------------");
            if(generarFichero(categ)) {
                System.out.println("Fichero generado con los productos de la categoría: " + categ);
            } else {
                System.out.println("No se ha encontrado ningún producto de la categoría: " + categ);
            }
            System.out.println("------------------------------------------------");
            System.out.print("¿Continuar con más ficheros? (S/N) ");
            try {
                cont = sc.nextLine().toUpperCase().charAt(0);
            } catch (Exception e) {
                cont = 'S'; // Evita linea vacía al evaluar charAt(0)
            }

        } while (cont != 'N');

        System.out.println("Hasta la próxima \\m/ (oo) \\m/");
        sc.close();
    }
}
