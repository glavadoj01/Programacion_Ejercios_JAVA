package examen2Prueba;

/*
Deseamos saber:
        a. (1) Quién es el empleado que más ha vendido en el año.
        b. (1.5) Cuál ha sido el mes con más ventas.
        c. (1) Qué empleado ha conseguido la mayor venta. Decir cantidad, nombre y en qué mes.
        d. (1.5) Por cada mes qué vendedor ha vendido más.
        */
public class Examen2 {
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    static int[][] ventas = {{10, 25, 67, 89, 32, 87, 54, 86, 92, 62, 74, 57},
            {16, 15, 19, 43, 18, 89, 58, 17, 87, 33, 85, 49},
            {27, 38, 20, 65, 45, 97, 16, 68, 90, 48, 96, 39},
            {36, 42, 74, 30, 72, 69, 37, 40, 43, 74, 43, 51},
            {84, 58, 61, 84, 40, 50, 25, 83, 31, 62, 38, 23}};
    static String[] empleados = {"Antonio", "Angela", "Marta", "Jorge", "Alejandro"};
    static int[] mesMayorVenta = new int[3];

    public static void main(String[] args) {
        int mesMayor, empleadoConMasVentas;


        empleadoConMasVentas = empleadoMasVentas();
        System.out.println("El empleado con más ventas a lo largo del año es: " + empleados[empleadoConMasVentas]);

        mesMayor = mesMasVentas();
        System.out.println("El mes con más ventas es: " + meses[mesMayor]);

        mesMayorVenta = hayarMayor();
        System.out.println("La mayor venta fue de \"" + mesMayorVenta[0] + "\"; correspondiente al empleado/a \"" +
                empleados[mesMayorVenta[1]] + "\"; durante el mes de \"" + meses[mesMayorVenta[2]] + "\"");
    }

    public static int empleadoMasVentas() {
        int[] n_ventas = new int[empleados.length];
        int mesMax = 0, n_max = 0;

        for (int i = 0; i < empleados.length; i++) { //Para cada empleado

            for (int j = 0; j < ventas.length; j++) { //Elijo fila ventas/empleado
                for (int k = 0; k < ventas[j].length; k++) { // Recorro la fila
                    n_ventas[i] += ventas[j][k];
                }
            }
            if (n_ventas[i] > n_max) {
                n_max = n_ventas[i];
                mesMax = i;
            }
        }
        return mesMax;
    }

    public static int mesMasVentas() {
        int[] n_ventas = new int[meses.length];
        int mesMax = 0, n_max = 0;

        for (int i = 0; i < ventas[0].length; i++) {  // i == Columna
            for (int j = 0; j < ventas.length; j++) { // j == Fila
                n_ventas[i] += ventas[j][i];
            }
            if (n_ventas[i] > mesMax) {
                mesMax = n_ventas[i];
                n_max = i;
            }
        }
        return n_max;
    }

    public static int[] hayarMayor() {
        int[] cantidadNombreMes = new int[3];
        int mayor = 0;

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                if (ventas[i][j] > mayor) {
                    mayor=ventas[i][j];
                    cantidadNombreMes[0] = ventas[i][j];
                    cantidadNombreMes[1] = i;
                    cantidadNombreMes[2] = j;
                }
            }
        }

        return cantidadNombreMes;
    }

    public static int[] mesAMes(){


    }
}