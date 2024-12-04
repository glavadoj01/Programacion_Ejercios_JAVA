package ejercicio31;

/*
Diseña un programa Java que ordene de menor a mayor los valores de un array de
números enteros.        https://www.discoduroderoer.es/formas-de-ordenar-un-array-en-java/
*/
public class Ejercicio31 {
    public static void main(String[] args) {
        int[] unArray = {10, 1, 2, 3, 9, 9, 8, 7, 6, 5, 5, 4, 3, 2, 1};
        int aux;

        printarArray(unArray);
        for (int i = 0; i < (unArray.length - 1); i++) {    // El último elemento ya será el mayor de todos
//      Para cada elemento, compruebo los más a la derecha (a la izquierda ya estarán o es el 1º)
            for (int j = i + 1; j < unArray.length; j++) {
                if (unArray[j] < unArray[i]) {
                    // Si elemento más a la derecha [j] es menor que elemento que toca [i]
                    // Intercambiamos valores --> Al final, el más pequeño está en [i]
                    aux = unArray[i];   // Saco temporalmente el [i]
                    unArray[i] = unArray[j]; // Guardo el que es más pequeño [j] en [i]
                    unArray[j] = aux;   // Devuelvo el k había a la posición [j] y sigo mirando el resto
                }
            }
        }
        printarArray(unArray);
    }

    public static void printarArray(int[] array) {
        System.out.print("El array es:\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.print("\b\n");
    }
}
