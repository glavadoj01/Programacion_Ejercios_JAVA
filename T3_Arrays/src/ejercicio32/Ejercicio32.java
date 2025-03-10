package ejercicio32;

import java.util.Scanner;

/*
Diseña un programa Java que contenga una función que permita buscar valores en un array ordenado.
*/
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int[] unArrayOrdenado = new int[50];
        int num, pos;

        int contadorOrden = 1;   // Para llenar desde el 1
        for (int i = 0; i < unArrayOrdenado.length; i++) {
            unArrayOrdenado[i] = contadorOrden;
            contadorOrden++;
        }
        System.out.print("Ingresar nº a buscar: ");
        num = escanear.nextInt();
        pintarArray(unArrayOrdenado);

        pos = 1 + buscarPosicionValor(num, unArrayOrdenado, 0, unArrayOrdenado.length - 1);

        if (pos == 0) {
            System.out.printf("No se encontró el valor %d en ninguna posición",num);
        } else {
            System.out.printf("El numero %d, se encuentra en la posición nº %d", num, pos);
        }
    }

    public static int buscarPosicionValor(int numBuscar, int[] array, int indiceInicio, int indiceFin) {
        int posicion, valormedio;
                                        //  https://oregoom.com/java/recursividad/      ==>     Búsqueda Binaria
        if (indiceInicio > indiceFin) {
            return -1;
        }

        valormedio = (indiceFin + indiceInicio) / 2;

        if (numBuscar == array[valormedio]) {
            posicion = valormedio;
            return posicion; // Si lo encuentro; salimos inmediatamente
        } else if (numBuscar > array[valormedio]) {
            indiceInicio = valormedio+1;
        } else {
            indiceFin = valormedio-1;
        }
        posicion = buscarPosicionValor(numBuscar, array, indiceInicio, indiceFin);
        return posicion; //Si no lo encontré en el IF, ejecutamos recursividad y devolvemos posicion
        // tmb vale directamente:    return buscarPosicionValor(numBuscar, array, indiceInicio, indiceFin);
    }

    public static void pintarArray(int[] unaArray) {
        for (int i = 0; i < unaArray.length; i++) {
            System.out.print(unaArray[i] + "\t");
        }
        System.out.print("\b\n");
    }
}
