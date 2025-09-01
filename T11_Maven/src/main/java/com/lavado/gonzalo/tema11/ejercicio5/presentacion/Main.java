package com.lavado.gonzalo.tema11.ejercicio5.presentacion;

/*
Obtener en PDF un listado de la tabla productos cuyo precio de venta esté entre dos valores dados.
Ordena los datos de forma ascendente por el precio de venta.
Crea una clase con un método que reciba como parámetros el nombre del archivo que debe crearse y los precios.
Observa la imagen.
Para realizar este ejercicio necesitas cargar la dependencia de la API iTextPdf.
*/

import com.lavado.gonzalo.tema11.ejercicio5.logica.Operaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreArchivo;
        float precioMinimo, precioMaximo;
        char op = 'S';

        // Bucle Principal
        while (op == 'S') {
            System.out.print("""

                    Ingresar precio mínimo y máximo para generar un PDF con los productos
                    cuyos precios estén entre esos valores.
                    0. Ingresar nombre del archivo (sin extensión):\s""");
            nombreArchivo = sc.nextLine();

            // Validación del precio mínimo
            while (true) {
                try {
                    System.out.print("1. Ingresar precio mínimo: ");
                    precioMinimo = sc.nextFloat();
                    break;
                } catch (Exception e) {
                    System.out.println("Error: Debe ingresar un número válido.");
                } finally {
                    sc.nextLine();
                }
            }
            // Validación del precio máximo
            while (true) {
                try {
                    System.out.print("2. Ingresar precio máximo: ");
                    precioMaximo = sc.nextFloat();
                    break;
                } catch (Exception e) {
                    System.out.println("Error: Debe ingresar un número válido.");
                } finally {
                    sc.nextLine();
                }
            }

            // Ejecutar la operación de generación del PDF
            if (Operaciones.generarPDF(nombreArchivo, precioMinimo, precioMaximo)) {
                System.out.println("PDF generado correctamente.");
            } else {
                System.out.println("Error al generar el PDF.");
            }

            // Preguntar si se desea generar otro PDF o salir
            while (true) {
                System.out.println("Quiere generar otro PDF? (S/N)");
                op = sc.nextLine().toUpperCase().charAt(0);
                if (op == 'S' || op == 'N') {
                    break;
                }
                System.out.println("Error: Debe ingresar S o N.");
            }
        }
        sc.close();
    }
}