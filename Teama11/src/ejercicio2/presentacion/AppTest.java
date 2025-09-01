package ejercicio2.presentacion;

import tema11.ejercicio2.operaciones.Operaciones;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Con Statement");
        System.out.print("Ingresar nombre categoría:");
        String nombre1 = sc.nextLine();
        System.out.println("Ingresar descripción:");
        String descripcion1 = sc.nextLine();
        int nStatement = Operaciones.conStatement(nombre1, descripcion1);
        if (nStatement > 0){
            System.out.println("Agregado a la base de datos " + nStatement + " registro/s");
        } else {
            System.out.println("No se ha podido agregar a la base de datos");
        }

        System.out.println("***********************");
        System.out.println("Con Prepared Statement");
        System.out.print("Ingresar nombre categoría:");
        String nombre2 = sc.nextLine();
        System.out.println("Ingresar descripción:");
        String descripcion2 = sc.nextLine();
        int nPreparedStatement = Operaciones.conPreparedStatement(nombre2, descripcion2);
        if (nPreparedStatement > 0){
            System.out.println("Agregado a la base de datos " + nPreparedStatement + " registro/s");
        } else {
            System.out.println("No se ha podido agregar a la base de datos");
        }

        sc.close();
    }
}
