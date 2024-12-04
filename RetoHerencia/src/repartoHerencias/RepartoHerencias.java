package repartoHerencias;

import java.util.Scanner;

/*
        https://aceptaelreto.com/problem/statement.php?id=103
*/

public class RepartoHerencias {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        byte grado;
        int elementos;
        double areaC, areaA;
        int[] coefeicientes;

        do {

            // Introducir Grado Polinomio [1-19] | Opción 20 para salir
            do {
                System.out.print("Ingrese el grado del polinomio (entre 1 y 19, 20 para salir): ");
                try {
                    grado = escanear.nextByte();
                    if (grado < 1 || grado > 20) {
                        System.out.println("ERROR - Grado no valido");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Error - Ingresar un nº entero para el orden del polinomio");
                    escanear.nextLine();
                }
            } while (true);
            if (grado == 20) {
                break;
            }

            // Introduccir n+1 coeficientes (para contar el coeficiente de la potencia cero)
            coefeicientes = new int[grado + 1];
            for (int i = 0; i <= grado; i++) {
                do {
                    System.out.print("Introduzca el coeficiente de la potencia " + (grado - i) + ": ");
                    try {
                        coefeicientes[i] = escanear.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error - Ingresar un nº entero para el coeficiente " + i);
                        escanear.nextLine();
                    }

                } while (true);
            }

            // Introducir el nº de elementos/divisiones
            do {
                System.out.print("Ingrese el nº de divisiones/rectángulos que desea probar: ");
                try {
                    elementos = escanear.nextInt();
                    if (elementos < 1) {
                        System.out.println("ERROR - Nº de divisiones no valido");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Error - Ingresar un nº entero para el nº de divisiones/rectángulos");
                    escanear.nextLine();
                }
            } while (true);

            areaC = obtenerArea(coefeicientes, elementos);   // CAIN
            areaA = 1 - areaC;                                      // ABEL

            // Resultado
            if (areaC - areaA >= -0.001 && areaC - areaA <= 0.001) {
                System.out.println("Justo");
            } else if (areaC - areaA < (-0.001)) {
                System.out.println("ABEL");
            } else {
                System.out.println("CAIN");
            }
        } while (true);
    }

    public static double obtenerArea(int[] coeficientes, int elementos) {
        double b, h, areaelemento, area = 0;
        b = 1 / (double) elementos; // Elemento base

        for (int i = 0; i < elementos; i++) {
            h = obtenerFuncionElemento(coeficientes, (i * b));
            areaelemento = b * h;
            area = area + areaelemento;
        }
        return area;
    }

    public static double obtenerFuncionElemento(int[] coeficientes, double x) {
        double h = 0, hi;

        for (int i = 0; i <= coeficientes.length - 1; i++) {
            hi = coeficientes[i] * Math.pow(x, (coeficientes.length - 1 - i));
            h = h + hi;
        }

        if (h < 0) {
            return 0;
        } else if (h > 1) {
            return 1;
        } else {
            return h;
        }
    }

}
