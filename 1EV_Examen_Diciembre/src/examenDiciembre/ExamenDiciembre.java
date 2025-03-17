package examenDiciembre;

import java.util.Random;
import java.util.Scanner;

public class ExamenDiciembre {
    static Scanner escanear = new Scanner(System.in);
    static int[][] matrizGeneral;
    static String[] Meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre"};


    public static void main(String[] args) {
        boolean continuar = true, generada = false;
        int opcion, numC, sumImpares, nFin, nLetras, nFilaMayor, nColumnaMayor;
        char letra;

        while (continuar) {
            imprMenu();
            opcion = escanear.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuántas filas y columnas para la matriz cuadrada?");
                    numC = escanear.nextInt();
                    matrizGeneral = crearMatriz(numC);
                    imprMatriz(matrizGeneral);
                    generada = true;
                    break;
                case 2:
                    if (generada) {
                        sumImpares = sumarImpares(matrizGeneral);
                        System.out.println("La suma de los impares es: " + sumImpares);
                    } else {
                        System.out.println("Error - Generar 1º una matriz");
                    }
                    break;
                case 3:
                    if (generada) {
                        hayarMaxMinMed(matrizGeneral);
                    } else {
                        System.out.println("Error - Generar 1º una matriz");
                    }
                    break;
                case 4:
                    if (generada) {
                        while (true) {
                            System.out.println("Buscar nº's acabados en: (introducir nº entre 0 y 9)");
                            nFin = escanear.nextInt();
                            if (nFin >= 0 && nFin <= 9) {
                                break;
                            }
                            System.out.println("Error - Introducir un solo digito");
                        }
                        buscarNumero(nFin, matrizGeneral);
                    } else {
                        System.out.println("Error - Generar 1º una matriz");
                    }
                    break;
                case 5:
                    operacionesArrays();
                    break;
                case 6:
                    System.out.println("¿Que letra desea buscar entre los nombres de los meses? ");
                    letra = escanear.next().charAt(0);
                    nLetras = buscarLetra(letra);
                    System.out.println("La letra \"" + letra + "\", aparece " + nLetras + " veces");
                    break;
                case 7:
                    if (generada) {
                        nFilaMayor = hayarFilaMayor(matrizGeneral);
                        System.out.println("La fila cuya suma es mayor es la fila nº " + nFilaMayor);
                    } else {
                        System.out.println("Error - Generar 1º una matriz");
                    }
                    break;
                case 8:
                    if (generada) {
                        nColumnaMayor = hayarColumnaMayor(matrizGeneral);
                        System.out.println("La columna cuya suma es mayor es la columna nº " + nColumnaMayor);
                    } else {
                        System.out.println("Error - Generar 1º una matriz");
                    }
                    break;
                case 9:
                    continuar = false;
                    break;
                default:
                    System.out.println("Error - Opción no valida");

            }
        }
        escanear.close();
    }

    public static void imprMenu() {
        System.out.print("""
                1 Crear una matriz
                2 Calcular suma de impares
                3 Calcular máximo, mínimo y media
                4 Busca número acabado
                5 Operaciones array de strings
                6 Busca letra final
                7 Fila mayor
                8 Columna mayor
                9 Salir
                Seleccionar una opción:"""
        );
    }

    public static int[][] crearMatriz(int num) {
        Random crearRandom = new Random();
        int[][] matriz = new int[num][num];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = crearRandom.nextInt(100) + 1;
                }
            }
        }
        return matriz;
    }

    public static void imprMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int sumarImpares(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 1) {
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    public static void hayarMaxMinMed(int[][] matriz) {
        int max = 0, min = 100;
        float med = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
                med += matriz[i][j];
            }
        }
        med = med / (matriz.length * matriz[0].length);
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
        System.out.printf("La média es: %.2f\n", med);
    }

    public static void buscarNumero(int num, int[][] matriz) {
        String entrada;
        char buscar, interno;

        entrada = String.valueOf(num);
        buscar = entrada.charAt(0);

        imprMatriz(matriz);
        System.out.println("Los n's acabados en " + num + " son: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                entrada = String.valueOf(matriz[i][j]);
                interno = entrada.charAt(entrada.length() - 1);
                if (buscar == interno) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
    }

    public static void operacionesArrays() {
        int cont, contMax = 0, posicion = 0;

        for (int i = 0; i < Meses.length; i++) {
            cont = 0;
            for (int j = 0; j < Meses[i].length(); j++) {
                if (Meses[i].charAt(j) == 'a' || Meses[i].charAt(j) == 'e' || Meses[i].charAt(j) == 'i'
                        || Meses[i].charAt(j) == 'o' || Meses[i].charAt(j) == 'u') {
                    cont++;
                }
            }
            if (cont > contMax) {
                contMax = cont;
                posicion = i;
            }
        }

        System.out.println("El 1º mes con más vocales en el nombre es: " + Meses[posicion]);
    }

    public static int buscarLetra(char letra) {
        int cont = 0;
        for (int i = 0; i < Meses.length; i++) {
            if (letra == Meses[i].charAt(Meses[i].length() - 1)) {
                cont++;
            }
        }
        return cont;
    }

    public static int hayarFilaMayor(int[][] matriz) {
        int fila = 0, sumaMayor = 0, suma;

        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            if (suma > sumaMayor) {
                sumaMayor = suma;
                fila = i;
            }
        }
        return (fila + 1); // DEVUELVE EL Nº DE LA FILA, NO EL ÍNDICE
    }

    public static int hayarColumnaMayor(int[][] matriz) {
        int columna = 0, sumaMayor = 0, suma;

        for (int j = 0; j < matriz.length; j++) {
            suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            if (suma > sumaMayor) {
                sumaMayor = suma;
                columna = j;
            }
        }
        return (columna + 1); // DEVUELVE EL Nº DE LA COLUMNA, NO EL ÍNDICE
    }
}