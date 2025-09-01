package com.lavado.gonzalo.tema11.ejercicio6.presentacion;

/*
Diseña una aplicación Java que permita crear un PDF con los clientes de una localidad concreta.
Las columnas que deben aparecer en el archivo son:
    - Número de cliente
    - Nombre
    - Teléfono
    - Ciudad
    - País
El archivo debe llamarse ClientesDeXXXX.pdf (Localidad)
*/

import com.lavado.gonzalo.tema11.ejercicio6.logica.Operaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String poblacion;
        char op = 'S';

        // Bucle Principal
        while (op == 'S') {
            System.out.print("""
                    ------------------------------------------------------------------------
                    Ingresar población para generar un PDF con los clientes de esa localidad
                    ------------------------------------------------------------------------
                    Ingresar población:\s""");
            poblacion = sc.nextLine();

            // Ejecutar la operación de generación del PDF
            if (Operaciones.generarPDF(poblacion)) {
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