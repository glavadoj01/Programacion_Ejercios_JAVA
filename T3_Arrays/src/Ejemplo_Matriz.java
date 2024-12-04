import java.util.Random;
/*       ÍNDICES           Col0    Col1    Col2    Col3    Col4
Matriz5x5 =:    Fil0        m00     m01     m02     m03     m04
                Fil1        m10     m11     m12     m13     m14
                Fil2        m20     m21     m22     m23     m24
                Fil3        m30     m31     m32     m33     m34
                Fil4        m40     m41     m42     m43     m44

Un ELEMENTO DE UNA MATRIZ siempre tiene 2 indices. El 1º para la fila y el 2º para la columna.

índice - fila i: desde 0 hasta (matriz.length - 1)          El menos 1 es xq empieza en cero.
                                                            En el FOR no lo ponemos xq ponemos MENOR QUE matriz.length
                                                            i < matriz.length    es igual    i <= (matriz.length - 1)

índice - columna j: desde 0 hasta (matriz[i].length - 1)    matriz[i] hace referencia a la "Fila i"
                                                            matriz[i].length me devuelve la longitud de la "Fila i"

Para llamar o trabajar con un elemento concreto   matriz[i][j]

System.out.print(matriz)
    ==>      Nombre "raro" / Conjunto de caracteres que representa "La dirección de Memoria donde está guardado"

System.out.print(matriz[i])
    ==>     Dirección de memoria donde se encuentra la fila i ("Array i" de la Matriz)

System.out.print(matriz[i][j])
    ==>     Imprime el elemento [i][j] de la matriz, en este caso SÍ imprime lo que haya ahi, ya sea un INT, DOUBLE,...
*/
public class Ejemplo_Matriz {
    public static void main(String[] args) {
        Random crearRandom = new Random();
        int[][] unaMatrizOrdenada = new int[3][4];
        int[][] unaMatrizAlAzar = new int[2][5];


// Llenar una matriz ordenada: (3filas x 4columnas = 12elementos; llenarlos del 1 al 12)
        int contadorOrden = 1;   // Para llenar desde el 1
        for (int i = 0; i < unaMatrizOrdenada.length; i++) {   // Elijo una fila, la i
            /*
            Aquí puedo hacer algo antes de recorrer la fila. Se hará para cada fila
                Ej's:  Reiniciar contadores/sumadores; Imprimir un texto para cada fila; ...
            */
            for (int j = 0; j < unaMatrizOrdenada[i].length; j++) {     // Reccorro los elementos de esa fila
                unaMatrizOrdenada[i][j] = contadorOrden;                // La vamos a llenar con los nº's en orden
                contadorOrden++;                                        // Tras llenar el elemento de la matriz,
            }                                                           // actualizo el nº para el siguiente
            /*
            Ya he recorrido la fila, aquí puedo hacer algo para toda la fila tmb,
                como un salto de línea o para que saque/guarde lo que acumule en la misma.
            */
        }
        System.out.println("Matriz Ordenada: ");
        pintarMatriz(unaMatrizOrdenada);

// Llenar una matriz al azar entre 12 y 34 (incluidos los dos):
        for (int i = 0; i < unaMatrizAlAzar.length; i++) {
            for (int j = 0; j < unaMatrizAlAzar[i].length; j++) {
                unaMatrizAlAzar[i][j] = crearRandom.nextInt(34-12+1)+12;
//   Paréntesis: Nº mayor k SÍ aparece: 34;  menos Nº menor k SÍ aparece:12;   +1 siempre para que aparezca el mayor
//                  El problema te puede decir entre 2 nº's, incluidos
//                  O entre 2 nº's no incluidos; en este caso sería: Entre 11 y 35 (sin incluir los extremos)
//                  O entre 12 (incluido) y 35 (no incluido), las tres formas te piden lo mismo.
//                  En el 2º y 3º caso tenemos k poner en la fórmula los nº's que SÍ queremos que aparezcan (12 y 34)
            }
        }
        System.out.println("Matriz Al Azar: ");
        pintarMatriz(unaMatrizAlAzar);

        System.out.println("unaMatrizAlAzar");
        System.out.println(unaMatrizAlAzar);        // Dirección de memoria

        System.out.println("unaMatrizAlAzar[1]");
        System.out.println(unaMatrizAlAzar[1]);    // Dirección de memoria

        System.out.println("unaMatrizAlAzar[1][1]");
        System.out.println(unaMatrizAlAzar[1][1]);  // Este si imprime el elemento contenido (imprime lo que hay ahí)
                                                    // En este caso, el elemento [1][1] de la Matriz Al Azar
    }

    public static void pintarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {   // Elijo fila con i
            System.out.print("Fila nº " + (i + 1) + " (indice nº " + i + "):\t"); // Imprimo un texto para cada fila

            for (int j = 0; j < matriz[i].length; j++) {   // Elijo columnas j de la fila i
                System.out.print(matriz[i][j] + "\t");    // Imprimo cada elemento i,j de cada fila

            }

            System.out.print("\n");         // Al acabar cada fila, salto de línea
        }
        // Si hubiera que devolver algo, el RETURN iria aquí, ya fuera del FOR-fila
        // En este caso solo imprime; así que nada.
    }
}