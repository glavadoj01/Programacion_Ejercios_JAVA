package conecta4;
/*
Desarrolla un programa que emule el juego 4 en raya o también llamado conecta 4.
Debe funcionar en consola, aparecer el tablero y las fichas de dos jugadores.

https://www.epasatiempos.es/juego-4-en-raya.php
*/

import java.util.Scanner;

public class Conecta4 {
    // Variables y Métodos fijos
    static Scanner escanear = new Scanner(System.in);
    static final String JUGADOR1 = "X";
    static final String JUGADOR2 = "O";
    static final int FILAS = 6;
    static final int COLUMNAS = 7;
    static String[][] tablero = new String[FILAS][COLUMNAS];

    // Variables que deben ser reiniciadas
    static boolean victoria;
    static int contadorCasillasVacias;
    static String jugadorActual;

    // Variables de juego
    static int ultimoMovimiento;
    static int ultimaFila;

    public static void main(String[] args) {
        boolean repetirPartida;

        do {    // Bucle para iniciar o repetir partidas
            victoria = false;
            contadorCasillasVacias = tablero.length * tablero[0].length;
            jugadorActual = JUGADOR1;

            cabecera();
            rellenarTableroInicial();

            while (true) {  // Bucle de juego
                pintarTablero();
                jugadorInserta();
                comprobar4();
                if (victoria || contadorCasillasVacias == 0) {
                    break;
                }
                cambiarJugador();
            }
            pintarTablero();
            mensajeFinal();

            repetirPartida = volverAjugar();
        } while (repetirPartida);

        escanear.close(); // Se cierra sí solo sí no repetimos partida. Si repetimos sigue abierto
    }

    public static void cabecera() {
        System.out.print("""
                ▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌
                ▐ ░█░█░░░█▀▀░█▀█░░░█▀▄░█▀█░█░█░█▀█ ▌
                ▐ ░░▀█░░░█▀▀░█░█░░░█▀▄░█▀█░░█░░█▀█ ▌
                ▐ ░░░▀░░░▀▀▀░▀░▀░░░▀░▀░▀░▀░░▀░░▀░▀ ▌
                ▐▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌
                """);
        System.out.println();
    }

    public static void rellenarTableroInicial() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = " "; // Cada vez que empieza una partida nueva, se vacían todas las casillas
            }
        }
    }

    public static void pintarTablero() {
        //Números de cada columna
        System.out.print("   ");
        for (int j = 0; j < tablero[0].length; j++) {
            System.out.print(" " + (j + 1) + "  ");
        }
        System.out.print("\n");

        //Borde superior
        System.out.print("  ·");
        for (int j = 0; j < tablero[0].length; j++) {
            System.out.print("---·");
        }
        System.out.print("\n");

        //Filas
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" " + tablero[i][j] + " |");
            }
            System.out.print("\n");

            //Líneas que separan cada fila
            System.out.print("  ·");
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print("---·");
            }
            System.out.print("\n");
        }
    }

    public static void jugadorInserta() {
        int movActual;
        boolean movValido = false;

        while (!movValido) {

            while (true) {
                System.out.print("Ingrese una columna del 1 al 7: ");
                movActual = escanear.nextInt();
                if (movActual >= 1 && movActual <= tablero[0].length) { //Comprobar que la columna introducida es válida
                    movActual = movActual - 1;  // Corregimos el índice de la Matriz Tablero
                    break;
                }
                System.out.println("ERROR - Introducir una columna valida");
                // Si se ejecuta el "Break" => Sale del While(true), por lo que el mensaje de error no aparece
            }

            // Para ver si aún quedan huecos en esa columna: Miramos desde abajo hasta hallar una casilla vacía
            for (int i = tablero.length - 1; i >= 0; i--) {
                if (tablero[i][movActual].equals(" ")) {    // Buscar la 1ª casilla vacía desde abajo
                    tablero[i][movActual] = jugadorActual;  // Insertar ficha
                    ultimoMovimiento = movActual;           // Guardar la columna del último movimiento
                    ultimaFila = i;                         // Guardar la fila del último movimiento
                    contadorCasillasVacias--;               // Restar 1 al contador de casillas vacías
                    movValido = true;
                    break;                 // Este "Break" finaliza el FOR (no sigue mirando el resto de columnas)
                }
            }

            if (!movValido) {           // Si ha mirado toda la columna y no encuentra hueco:
                System.out.println("ERROR - La columna seleccionada está llena");
            }
        }
    }

    public static void comprobar4() {
        int contarFichasH = 0;
        int contarFichasV = 0;
        int contarFichasD1 = 0;
        int contarFichasD2 = 0;
        int k; // Para las díagonales

        //Comprobación Horizontal a Izquierda
        for (int j = ultimoMovimiento; j >= Math.max(0, (ultimoMovimiento - 3)); j--) {
            if (tablero[ultimaFila][j].equals(jugadorActual)) {
                contarFichasH++;
            } else {
                break;
            }
        }
        //Comprobación Horizontal a Derecha
        for (int j = ultimoMovimiento + 1; j <= Math.min(tablero[ultimaFila].length - 1, (ultimoMovimiento + 3)); j++) {
            if (tablero[ultimaFila][j].equals(jugadorActual)) {
                contarFichasH++;
            } else {
                break;
            }
        }
        // Comprobación Vertical hacia abajo
        for (int i = ultimaFila; i <= Math.min(tablero.length - 1, ultimaFila + 3); i++) {
            if (tablero[i][ultimoMovimiento].equals(jugadorActual)) {
                contarFichasV++;
            } else {
                break;
            }
        }
        // Comprobación D1 a izquierda/arriba
        k = 0;
        for (int i = ultimaFila; i >= Math.max(0, ultimaFila - 3); i--) {
            if (tablero[i][ultimoMovimiento - k].equals(jugadorActual)) {
                contarFichasD1++;
            } else {
                break;
            }
            k++;
            if (ultimoMovimiento - k < 0) {
                break;
            }
        }
        // Comprobación D1 a derecha/abajo
        k = 1;
        for (int i = ultimaFila + 1; i <= Math.min(ultimaFila + 3, tablero.length - 1); i++) {
            if (ultimoMovimiento + k >= tablero[ultimaFila].length) {
                break;
            }
            if (tablero[i][ultimoMovimiento + k].equals(jugadorActual)) {
                contarFichasD1++;
            } else {
                break;
            }
            k++;
        }
        // Comprobación D2 a derecha/arriba
        k = 0;
        for (int i = ultimaFila; i >= Math.max(0, ultimaFila - 3); i--) {
            if (tablero[i][ultimoMovimiento + k].equals(jugadorActual)) {
                contarFichasD2++;
            } else {
                break;
            }
            k++;
            if (ultimoMovimiento + k >= tablero[ultimaFila].length - 1) {
                break;
            }
        }
        // Comprobación D2 a izquierda/abajo
        k = 1;
        for (int i = ultimaFila + 1; i <= Math.min(ultimaFila + 3, tablero.length - 1); i++) {
            if (ultimoMovimiento - k < 0) {
                break;
            }
            if (tablero[i][ultimoMovimiento - k].equals(jugadorActual)) {
                contarFichasD2++;
            } else {
                break;
            }
            k++;
        }
        if (contarFichasH >= 4 || contarFichasV == 4 || contarFichasD1 >= 4 || contarFichasD2 >= 4) {
            victoria = true;
        }
    }

    public static void cambiarJugador() {
        if (jugadorActual.equals(JUGADOR1)) {
            jugadorActual = JUGADOR2;
        } else {
            jugadorActual = JUGADOR1;
        }
    }

    public static void mensajeFinal() {
        if (victoria) {
            if (jugadorActual.equals(JUGADOR1)) {
                System.out.println("ENHORABUENA - HA GANADO EL JUGADOR 1 ( \"X\" )");
            } else {
                System.out.println("ENHORABUENA - HA GANADO EL JUGADOR 2 ( \"O\" )");
            }
            System.out.print("""
                    
                                                       .''.\s
                           .''.      .        *''*    :_\\/_:     .\s
                          :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\s
                      .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\s
                     :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\s
                     : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\s
                      '..'  ':::'     * /\\ *     .'/.\\'.   '\s
                          *            *..*         :\s
                           *\s
                            *\s
                    """);
        } else {
            System.out.println("La partida ha finalizado en empate");
        }
    }

    public static boolean volverAjugar() {
        String respuesta;
        while (true) {
            System.out.print("¿Desea volver a jugar? (S/N): ");
            respuesta = escanear.next().toUpperCase();
            if (respuesta.charAt(0) == 'S') {
                return true;
            } else if (respuesta.charAt(0) == 'N') {
                return false;
            } else {
                System.out.println("ERROR - Introduzca una respuesta válida");
            }
        }
    }
}
