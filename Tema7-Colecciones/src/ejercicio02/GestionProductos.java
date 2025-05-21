package ejercicio02;

/*
GestionProductos:
    Atributo el ArrayList de productos y los métodos:
        - nuevo producto. El producto podrá ser congelado, refrigerado o fresco.
        - eliminar producto. Localizar mediante su ID. Devolver true/false según se haya podido eliminar o no.
        - devolver productos. Devolver el ArrayList al completo.
        - Devolver los productos del tipo. Filtrar según tipo de producto (congelado, fresco o refrigerado).
            Devolver un ArrayList con los productos del tipo seleccionado.
        - eliminar todos los productos congelados. Retornar el número de productos eliminados.
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionProductos {
    private ArrayList<Producto> catalogoProductos;

    // Constructor
    public GestionProductos() {
        this.catalogoProductos = new ArrayList<>();
        this.catalogoProductos = cargarProductos(5);
    }

    // Datos de Prueba
    private ArrayList<Producto> cargarProductos(int numeroProductos) {
        ArrayList<Producto> listaGenerar = new ArrayList<>();
        String[] paises = {"España", "Italia", "Marruecos", "Argelia", "Francia"};
        String id, descripcion, codigo, paisO;
        int lote, tipo;
        double tempC;
        LocalDate fechaC, fechaE;

        for (int i = 0; i < numeroProductos; i++) {
            id = "00000" + i;
            descripcion = "Producto-" + i;
            fechaC = LocalDate.of(2025, 3, 3);
            lote = 123422 * i;
            tipo = (int) (Math.random() * 3);
            switch (tipo) {
                case 0:
                    //Congelado
                    tempC = -5.0 * i;
                    listaGenerar.add(new Congelado(tempC, id, descripcion, fechaC, lote));
                    break;
                case 1:
                    //Refrigerado
                    codigo = "ABC-" + i;
                    listaGenerar.add(new Refrigerado(codigo, id, descripcion, fechaC, lote));
                    break;
                case 2:
                    //Fresco
                    fechaE = LocalDate.now();
                    fechaE.minusDays(5); // Este fragmento de código pertenece a la parte descargada
                    paisO = paises[(int) (Math.random() * 5)];
                    listaGenerar.add(new Fresco(fechaE, paisO, id, descripcion, fechaC, lote));

            }
        }
        //Hago caducar el primer producto
        listaGenerar.getFirst().setFechaCad(LocalDate.now().minusDays(30));
        return listaGenerar;
    }

    // Eliminar Producto
    public boolean eliminarProducto(String idEliminar) {
        Iterator<Producto> it = catalogoProductos.iterator();
        while (it.hasNext()) {
            if (it.next().getIdProducto().equals(idEliminar)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // Devolver Productos
    public ArrayList<Producto> devolverProductos() {
        return catalogoProductos;
    } // Es necesario por qué el atributo es privado. Accedemos al catálogo mediante este metodo.

    // Devolver según tipo
    public ArrayList<Producto> productosSegunTipo(String tipo) {
        ArrayList<Producto> listaSalida = new ArrayList<>();
        for (Producto producto : catalogoProductos) {
            if (producto.getClass().getSimpleName().equals(tipo)) {
                listaSalida.add(producto);
            }
        }
        return listaSalida;
    }

    // Eliminar y contar congelados
    public int eliminarCongelados() {
        int cont = 0;
        Iterator<Producto> it = catalogoProductos.iterator();
        // No se puede recorrer un FOR y borrar a la vez sus elementos
        while (it.hasNext()) {
            if (it.next().getClass().getSimpleName().equals("Congelado")) {
                it.remove();
                cont++;
            }
        }
        return cont;
    }

    // Nuevo Producto  (Intenté ver si lo podríamos "importar", que copiar suena feo)
    public void nuevoProducto() {
        Scanner sc = new Scanner(System.in);
        int anno, mes, dia, lote, tipo;
        String idProducto, descripcion;

        System.out.println("Ingrese el id del producto: ");
        idProducto = sc.nextLine(); // Es un String, punto
        System.out.println("Ingrese una descripción (opcional): ");
        descripcion = sc.nextLine();
        System.out.println("Ingrese la fecha de caducidad: ");
        while (true) {
            try {
                System.out.println("Ingrese AÑO: (AAAA)");
                anno = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el nº del MES: (MM)");
                mes = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el nº del Día: (DD)");
                dia = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el nº del Lote:");
                lote = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Las fechas y el lote deben de ser Nº's Enteros");
            }
        }

        while (true) {
            try {
                System.out.println("Para el tipo de Producto:\t1-Congelado\t2-Refrigerado\t3-Fresco");
                tipo = sc.nextInt();
                sc.nextLine();
                if (tipo == 1 || tipo == 2 || tipo == 3) {
                    break;
                }
                System.out.println("TIPO INCORRECTO");
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("TIPO debe ser un entero");
            }
        }

        switch (tipo) {
            case 1://Congelado
                double tempC;
                System.out.println("Ingrese el temperatura de congelación: ");
                tempC = sc.nextDouble();
                sc.nextLine();
                catalogoProductos.add(new Congelado(tempC ,idProducto,descripcion,LocalDate.of(anno,mes,dia),lote));
                break;
            case 2://Refrigerado
                String codigo;
                System.out.println("Ingrese el codigo del producto: ");
                codigo = sc.nextLine();
                catalogoProductos.add(new Refrigerado(codigo, idProducto, descripcion, LocalDate.of(anno,mes,dia),lote));
                break;
            default://Fresco
                String paisOrigen;
                int anno2, mes2, dia2;
                System.out.println("Ingrese el pais origen: ");
                paisOrigen = sc.nextLine();
                System.out.println("Ingrese la fecha de envasado: ");
                while (true) {
                    try {
                        System.out.println("Ingrese AÑO: (AAAA)");
                        anno2 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el nº del MES: (MM)");
                        mes2 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el nº del Día: (DD)");
                        dia2 = sc.nextInt();
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        sc.nextLine();
                        System.out.println("Las fechas deben de ser Nº's Enteros");
                    }
                }
                catalogoProductos.add(new Fresco(LocalDate.of(anno2,mes2,dia2), paisOrigen,idProducto, descripcion, LocalDate.of(anno,mes,dia),lote));
        }
        sc.close();
    }
}
