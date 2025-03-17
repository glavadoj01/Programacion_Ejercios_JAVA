package ejercicio27;

import java.util.Random;
import java.util.Scanner;

/*
Diseña un programa Java que guarde DNI y nombre de 10 alumnos y sus notas en
tres exámenes (datos enteros). El programa solicitará un DNI al usuario y mostrará:
DNI del alumno: 8.888.099-X
Nombre: Luis Arrimada Vivas
Notas:
Examen 1: ***** 5
Examen 2: **** 4 Suspenso.
Examen 3: *** 3 Suspenso.
*/
public class Ejercicio27 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[][] alumnos = new String[10][7];
        int num;
        String entrada;

        // Definir alumnos (C0:Nombre C1:Apellido1 C2:Apellido2 C3:DNI C4:Nota1 C5:Nota2 C6:Nota3)
        for (int i = 0; i < alumnos.length; i++) {
            if (i < 9) {
                alumnos[i][0] = "Nombre0" + (i + 1);
                alumnos[i][1] = "Apellido0" + (i + 1) + ".1";
                alumnos[i][2] = "Apellido0" + (i + 1) + ".2";
            } else {
                alumnos[i][0] = "Nombre" + (i + 1);
                alumnos[i][1] = "Apellido" + (i + 1) + ".1";
                alumnos[i][2] = "Apellido" + (i + 1) + ".2";
            }
            alumnos[i][3] = String.valueOf(rand.nextInt(10)); //Inicializo DNI Borrando NULL con el 1º numero
            for (int j = 1; j < 8; j++) {                           // Resto de nº del DNI
                num = rand.nextInt(10);
                alumnos[i][3] += String.valueOf(num);
            }
            alumnos[i][3] += devolverletra(alumnos[i][3]);      // Aprovecho el ejercicio anterior para dar letra real
            for (int j = 4; j <= 6; j++) {                     // Añado notas como enteros
                alumnos[i][j] = String.valueOf(rand.nextInt(11));
            }
        }

        // Realizamos una presentacion para preguntar el DNI que se busca
        System.out.println("La lista de Alumnos/DNI es: ");
        System.out.println("Nombre\t\tDNI");
        pintarMatriz(alumnos, 0, 3);
        System.out.print("Para ver NOTAS, ingresar el DNI del alumno: ");
        entrada = sc.next();

        // Muestro la informacion del alumno
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i][3].equals(entrada)) {
                System.out.print("DNI del alumno: ");
                System.out.print(alumnos[i][3].substring(0, 2) + "." + alumnos[i][3].substring(2, 5) + "." + alumnos[i][3].substring(5, 8) + "-" + alumnos[i][3].charAt(8) + "\n");
                System.out.println("Nombre: " + alumnos[i][0] + " " + alumnos[i][1] + " " + alumnos[i][2]);
                System.out.println("Notas:");
                for (int j = 4; j <= 6; j++) {
                    System.out.print("Examen " + (j - 3) + ": ");
                    resolverExamen(alumnos[i][j]);
                }
            }
        }
    }

    public static String devolverletra(String numero) {
        int resto, num;
        String[] tabla = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H",
                "L", "C", "K", "E"};
        num = Integer.parseInt(numero);
        resto = num % 23;
        return tabla[resto];
    }

    public static void pintarMatriz(String[][] matriz, int nColumna1, int nColumna2) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][nColumna1] + "\t" + matriz[i][nColumna2]);
            System.out.print("\n");
        }
    }

    public static void resolverExamen(String nota) {
        int num = Integer.parseInt(nota);
        for (int j = 1; j <= num; j++) {
            System.out.print("*");
        }
        System.out.print(" " + num);
        if (num <= 4) {
            System.out.print(" Suspenso");
        }
        System.out.print("\n");
    }
}