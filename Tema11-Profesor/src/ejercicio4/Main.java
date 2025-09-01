package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ejercicio4 ejercicio4 = new Ejercicio4("classicmodels");
        ejercicio4.listarClientes();
        System.out.println("Elige un cliente (número): ");

        int cN = sc.nextInt();
        ejercicio4.pedidosCliente(cN);

        ejercicio4.cerrarConexion();
    }
}
